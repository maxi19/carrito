export interface ICategoria {
  id: number;
  nombre?: string | null;
}

export type NewCategoria = Omit<ICategoria, 'id'> & { id: null };
