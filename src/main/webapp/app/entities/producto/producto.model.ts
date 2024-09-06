import { ICategoria } from 'app/entities/categoria/categoria.model';

export interface IProducto {
  id: number;
  titulo?: string | null;
  nombre?: string | null;
  stock?: number | null;
  disponible?: boolean | null;
  precio?: number | null;
  descripcion?: string | null;
  producto_categoria?: Pick<ICategoria, 'id'> | null;
}

export type NewProducto = Omit<IProducto, 'id'> & { id: null };
