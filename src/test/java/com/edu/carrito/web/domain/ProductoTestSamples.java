package com.edu.carrito.web.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ProductoTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Producto getProductoSample1() {
        return new Producto().id(1L).titulo("titulo1").nombre("nombre1").stock(1).descripcion("descripcion1");
    }

    public static Producto getProductoSample2() {
        return new Producto().id(2L).titulo("titulo2").nombre("nombre2").stock(2).descripcion("descripcion2");
    }

    public static Producto getProductoRandomSampleGenerator() {
        return new Producto()
            .id(longCount.incrementAndGet())
            .titulo(UUID.randomUUID().toString())
            .nombre(UUID.randomUUID().toString())
            .stock(intCount.incrementAndGet())
            .descripcion(UUID.randomUUID().toString());
    }
}
