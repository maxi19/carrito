import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 18592,
  login: '|JWeQ@0\\;TWx\\1u05NWS',
};

export const sampleWithPartialData: IUser = {
  id: 30513,
  login: 'Fn6',
};

export const sampleWithFullData: IUser = {
  id: 20077,
  login: '_J',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
