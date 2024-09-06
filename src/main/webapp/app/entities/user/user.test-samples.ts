import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 16631,
  login: '?$?vU@u1l\\367PA7\\@yDyM0\\*m\\Xl',
};

export const sampleWithPartialData: IUser = {
  id: 156,
  login: '99p',
};

export const sampleWithFullData: IUser = {
  id: 16689,
  login: 'vm7Z2@RBa5\\_IEJ',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
