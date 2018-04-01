// const profile = {
//   'firstName': 'Joe',
//   'lastName': 'Montana',
//   'limit': 850.00
// }

const products = [
  { 'id': 1, 'title': 'Jelly Beans', 'price': 40.00, 'inventory': 10, 'shipping': 5.00, 'image': require('@/assets/jelly beans.jpeg')},
  { 'id': 2, 'title': 'BlueBerry Cheese Cake', 'price': 150.00, 'inventory': 25, 'shipping': 5.00, 'image': require('@/assets/blueberry cheese cake.jpeg') },
  { 'id': 3, 'title': 'Brownies', 'price': 95.00, 'inventory': 15, 'shipping': 5.00, 'image': require('@/assets/brownies.jpeg') },
  { 'id': 4, 'title': 'Chocolate Cookies', 'price': 55.00, 'inventory': 20, 'shipping': 5.00, 'image': require('@/assets/chocolate cookies.jpeg') },
  { 'id': 5, 'title': 'Churros', 'price': 60.00, 'inventory': 10, 'shipping': 5.00, 'image': require('@/assets/churros.jpeg') },
  { 'id': 6, 'title': 'Assorted Donuts', 'price': 65.00, 'inventory': 30, 'shipping': 5.00, 'image': require('@/assets/donuts.jpeg') },
  { 'id': 7, 'title': 'Ice Cream', 'price': 75.00, 'inventory': 20, 'shipping': 5.00, 'image': require('@/assets/ice cream.jpeg') },
  { 'id': 8, 'title': 'CupCakes', 'price': 45.00, 'inventory': 40, 'shipping': 5.00, 'image': require('@/assets/cupcakes.jpeg') },
  { 'id': 9, 'title': 'Macarons', 'price': 100.00, 'inventory': 30, 'shipping': 5.00, 'image': require('@/assets/macaron.jpeg') },
  { 'id': 10, 'title': 'Pancakes', 'price': 45.00, 'inventory': 10, 'shipping': 5.00, 'image': require('@/assets/pancakes.jpeg') },
  { 'id': 11, 'title': 'Panna Cotta', 'price': 35.00, 'inventory': 5, 'shipping': 5.00, 'image': require('@/assets/panna cotta.jpeg') },
  { 'id': 12, 'title': 'Strawberry Tart', 'price': 75.00, 'inventory': 10, 'shipping': 5.00, 'image': require('@/assets/strawberry tart.jpeg') },
  { 'id': 13, 'title': 'Waffles', 'price': 45.00, 'inventory': 20, 'shipping': 5.00, 'image': require('@/assets/waffles.jpeg') }
]

// const promotions = [
//   { 'id': 1, 'title': '30% OFF' },
//   { 'id': 2, 'title': '$100.00 Discount' },
//   { 'id': 3, 'title': 'Free Shipping' },
//   { 'id': 4, 'title': '+ $100.00 on limit' }
// ]

// Simulate requests

export default {
  // getProfile (cb) {
  //   setTimeout(() => cb(profile), 200)
  // },

  getProducts (cb) {
    setTimeout(() => cb(products), 200)
  }

  // getPromotions (cb) {
  //   setTimeout(() => cb(promotions), 200)
  // }
}
