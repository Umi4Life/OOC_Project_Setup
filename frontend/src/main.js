import Vue from 'vue'
import accounting from 'accounting'
import pluralize from 'pluralize'
import Shop from './components/shop/Shop'
import store from './store'
import Login from './components/Login'
import BootstrapVue from 'bootstrap-vue'

Vue.config.productionTip = false

Vue.filter('formatMoney', accounting.formatMoney)
Vue.filter('pluralize', pluralize)

Vue.use(BootstrapVue);


new Vue({
  el: '#shop',
  store,
  Login,
  render: h => h(Shop)
})
