package com.edu.carrito.web.domain;

import static com.edu.carrito.web.domain.CategoriaTestSamples.*;
import static com.edu.carrito.web.domain.ProductoTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.edu.carrito.web.web.rest.TestUtil;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class CategoriaTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Categoria.class);
        Categoria categoria1 = getCategoriaSample1();
        Categoria categoria2 = new Categoria();
        assertThat(categoria1).isNotEqualTo(categoria2);

        categoria2.setId(categoria1.getId());
        assertThat(categoria1).isEqualTo(categoria2);

        categoria2 = getCategoriaSample2();
        assertThat(categoria1).isNotEqualTo(categoria2);
    }

    @Test
    void productoTest() {
        Categoria categoria = getCategoriaRandomSampleGenerator();
        Producto productoBack = getProductoRandomSampleGenerator();

        categoria.addProducto(productoBack);
        assertThat(categoria.getProductos()).containsOnly(productoBack);
        assertThat(productoBack.getProducto_categoria()).isEqualTo(categoria);

        categoria.removeProducto(productoBack);
        assertThat(categoria.getProductos()).doesNotContain(productoBack);
        assertThat(productoBack.getProducto_categoria()).isNull();

        categoria.productos(new HashSet<>(Set.of(productoBack)));
        assertThat(categoria.getProductos()).containsOnly(productoBack);
        assertThat(productoBack.getProducto_categoria()).isEqualTo(categoria);

        categoria.setProductos(new HashSet<>());
        assertThat(categoria.getProductos()).doesNotContain(productoBack);
        assertThat(productoBack.getProducto_categoria()).isNull();
    }
}
