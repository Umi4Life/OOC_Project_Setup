<template><div>
  <!-- <div class="card text-xs-center">
    <div class="card-img-top vue-logo"></div>
    <div class="card-block">
      <h5 class="card-title">{{product.title}}</h5>
      <p class="card-text">{{product.price | formatMoney}} - Stock: {{product.inventory}}</p>
      <AddToCart :product="product" />
    </div>
  </div> -->

  <div class="card" style="width: 12.6rem;">
    <img class="card-img-top" v-bind:src=product.image alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">{{product.title}}</h5>
      <p class="card-text">{{product.price | formatMoney}} - Stock: {{product.inventory}}</p>
      <center><AddToCart :product="product" /></center>
    </div>
  </div>
  </div>
</template>

<script>
import AddToCart from './AddToCart'

export default {
  name: 'Product',
  props: {
    product: Object
  },
  components: { AddToCart }
}
</script>

<!-- <style scoped>
  .vue-logo {
    padding-bottom: 75%;
    /* src: url(product.image); */
    background: url('+'product.image'+') no-repeat center center #ddd;
    background-size: 100%;
  }
</style> -->
