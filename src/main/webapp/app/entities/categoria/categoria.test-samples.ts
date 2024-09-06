import { ICategoria, NewCategoria } from './categoria.model';

export const sampleWithRequiredData: ICategoria = {
  id: 10820,
};

export const sampleWithPartialData: ICategoria = {
  id: 27019,
};

export const sampleWithFullData: ICategoria = {
  id: 7943,
  nombre: 'bite champion tricky',
};

export const sampleWithNewData: NewCategoria = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
