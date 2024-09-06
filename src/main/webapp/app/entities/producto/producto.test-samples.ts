import { IProducto, NewProducto } from './producto.model';

export const sampleWithRequiredData: IProducto = {
  id: 28770,
};

export const sampleWithPartialData: IProducto = {
  id: 22940,
  precio: 18919,
};

export const sampleWithFullData: IProducto = {
  id: 19345,
  titulo: 'terraform as',
  nombre: 'hmph',
  stock: 30977,
  disponible: false,
  precio: 7667.91,
  descripcion: 'with',
};

export const sampleWithNewData: NewProducto = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
