package com.edu.carrito.web.service.impl;

import com.edu.carrito.web.domain.Categoria;
import com.edu.carrito.web.repository.CategoriaRepository;
import com.edu.carrito.web.service.CategoriaService;
import com.edu.carrito.web.service.dto.CategoriaDTO;
import com.edu.carrito.web.service.mapper.CategoriaMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link com.edu.carrito.web.domain.Categoria}.
 */
@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

    private static final Logger LOG = LoggerFactory.getLogger(CategoriaServiceImpl.class);

    private final CategoriaRepository categoriaRepository;

    private final CategoriaMapper categoriaMapper;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository, CategoriaMapper categoriaMapper) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaMapper = categoriaMapper;
    }

    @Override
    public CategoriaDTO save(CategoriaDTO categoriaDTO) {
        LOG.debug("Request to save Categoria : {}", categoriaDTO);
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoria = categoriaRepository.save(categoria);
        return categoriaMapper.toDto(categoria);
    }

    @Override
    public CategoriaDTO update(CategoriaDTO categoriaDTO) {
        LOG.debug("Request to update Categoria : {}", categoriaDTO);
        Categoria categoria = categoriaMapper.toEntity(categoriaDTO);
        categoria = categoriaRepository.save(categoria);
        return categoriaMapper.toDto(categoria);
    }

    @Override
    public Optional<CategoriaDTO> partialUpdate(CategoriaDTO categoriaDTO) {
        LOG.debug("Request to partially update Categoria : {}", categoriaDTO);

        return categoriaRepository
            .findById(categoriaDTO.getId())
            .map(existingCategoria -> {
                categoriaMapper.partialUpdate(existingCategoria, categoriaDTO);

                return existingCategoria;
            })
            .map(categoriaRepository::save)
            .map(categoriaMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<CategoriaDTO> findAll(Pageable pageable) {
        LOG.debug("Request to get all Categorias");
        return categoriaRepository.findAll(pageable).map(categoriaMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CategoriaDTO> findOne(Long id) {
        LOG.debug("Request to get Categoria : {}", id);
        return categoriaRepository.findById(id).map(categoriaMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        LOG.debug("Request to delete Categoria : {}", id);
        categoriaRepository.deleteById(id);
    }
}
