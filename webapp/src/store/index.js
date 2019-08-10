import Vue from 'vue'
import Vuex from 'vuex'
import app from './modules/app'
import menu from './modules/menu'
import tab from './modules/tab'
import user from './modules/user'
import iframe from "./modules/iframe";

//使用状态管理
Vue.use(Vuex)

const store = new Vuex.Store({
  modules:{
    app: app,
    menu: menu,
    tab: tab,
    user: user,
    iframe: iframe
  }
})

export default store
