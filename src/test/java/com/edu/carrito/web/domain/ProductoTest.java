package com.edu.carrito.web.domain;

import static com.edu.carrito.web.domain.CategoriaTestSamples.*;
import static com.edu.carrito.web.domain.ProductoTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.edu.carrito.web.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ProductoTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Producto.class);
        Producto producto1 = getProductoSample1();
        Producto producto2 = new Producto();
        assertThat(producto1).isNotEqualTo(producto2);

        producto2.setId(producto1.getId());
        assertThat(producto1).isEqualTo(producto2);

        producto2 = getProductoSample2();
        assertThat(producto1).isNotEqualTo(producto2);
    }

    @Test
    void producto_categoriaTest() {
        Producto producto = getProductoRandomSampleGenerator();
        Categoria categoriaBack = getCategoriaRandomSampleGenerator();

        producto.setProducto_categoria(categoriaBack);
        assertThat(producto.getProducto_categoria()).isEqualTo(categoriaBack);

        producto.producto_categoria(null);
        assertThat(producto.getProducto_categoria()).isNull();
    }
}
