import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '92b14edb-200b-4fa1-bbce-fdffe2f7078b',
};

export const sampleWithPartialData: IAuthority = {
  name: '5df30a38-af25-4a26-8c02-8035be9e5c30',
};

export const sampleWithFullData: IAuthority = {
  name: '862e658d-f38d-43c3-a2c2-52020f3736b3',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
