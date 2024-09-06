package com.edu.carrito.web.domain;

import static com.edu.carrito.web.domain.AssertUtils.bigDecimalCompareTo;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductoAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductoAllPropertiesEquals(Producto expected, Producto actual) {
        assertProductoAutoGeneratedPropertiesEquals(expected, actual);
        assertProductoAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductoAllUpdatablePropertiesEquals(Producto expected, Producto actual) {
        assertProductoUpdatableFieldsEquals(expected, actual);
        assertProductoUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductoAutoGeneratedPropertiesEquals(Producto expected, Producto actual) {
        assertThat(expected)
            .as("Verify Producto auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductoUpdatableFieldsEquals(Producto expected, Producto actual) {
        assertThat(expected)
            .as("Verify Producto relevant properties")
            .satisfies(e -> assertThat(e.getTitulo()).as("check titulo").isEqualTo(actual.getTitulo()))
            .satisfies(e -> assertThat(e.getNombre()).as("check nombre").isEqualTo(actual.getNombre()))
            .satisfies(e -> assertThat(e.getStock()).as("check stock").isEqualTo(actual.getStock()))
            .satisfies(e -> assertThat(e.getDisponible()).as("check disponible").isEqualTo(actual.getDisponible()))
            .satisfies(e -> assertThat(e.getPrecio()).as("check precio").usingComparator(bigDecimalCompareTo).isEqualTo(actual.getPrecio()))
            .satisfies(e -> assertThat(e.getDescripcion()).as("check descripcion").isEqualTo(actual.getDescripcion()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductoUpdatableRelationshipsEquals(Producto expected, Producto actual) {
        assertThat(expected)
            .as("Verify Producto relationships")
            .satisfies(e -> assertThat(e.getProducto_categoria()).as("check producto_categoria").isEqualTo(actual.getProducto_categoria()));
    }
}
