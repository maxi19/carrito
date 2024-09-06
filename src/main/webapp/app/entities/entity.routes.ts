import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'carritoApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'categoria',
    data: { pageTitle: 'carritoApp.categoria.home.title' },
    loadChildren: () => import('./categoria/categoria.routes'),
  },
  {
    path: 'producto',
    data: { pageTitle: 'carritoApp.producto.home.title' },
    loadChildren: () => import('./producto/producto.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
