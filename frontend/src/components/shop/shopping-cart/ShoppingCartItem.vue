<template>
  <div class="media mb-1">
    <div class="media-left">
      <div class="media-object rounded vue-logo">
        <img stlye="no-repeat center center #ddd" v-bind:src="item.image" height="45" width="45" />
      </div>
    </div>
    <div class="media-body">
      <strong class="d-block">{{item.title}}</strong>
      <span>Quantity: {{item.quantity}} - {{item.price | formatMoney}}</span>
    </div>
    <div class="media-right align-middle">
      <RemoveFromCart :product="item" />
    </div>
  </div>
</template>

<script>
import RemoveFromCart from './../products/RemoveFromCart'

export default {
  name: 'ShoppingCartItem',
  picture: '',
  props: {
    item: Object
  },
  components: { RemoveFromCart }
}
</script>

<style scoped>
  .vue-logo {
    height: 50px;
    width: 50px;
    background-size: 135%;
  }
</style>
