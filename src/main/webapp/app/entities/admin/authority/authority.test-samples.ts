import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: 'fe9e9f49-a279-4a06-b325-8df1082478d8',
};

export const sampleWithPartialData: IAuthority = {
  name: '6e3514b7-d95a-4897-a2ec-2c95fc20ca7e',
};

export const sampleWithFullData: IAuthority = {
  name: '31fb2102-7d8c-4525-be1d-aff6545c87f1',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
