package com.edu.carrito.web.service.mapper;

import com.edu.carrito.web.domain.Categoria;
import com.edu.carrito.web.domain.Producto;
import com.edu.carrito.web.service.dto.CategoriaDTO;
import com.edu.carrito.web.service.dto.ProductoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Producto} and its DTO {@link ProductoDTO}.
 */
@Mapper(componentModel = "spring")
public interface ProductoMapper extends EntityMapper<ProductoDTO, Producto> {
    @Mapping(target = "producto_categoria", source = "producto_categoria", qualifiedByName = "categoriaId")
    ProductoDTO toDto(Producto s);

    @Named("categoriaId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CategoriaDTO toDtoCategoriaId(Categoria categoria);
}
