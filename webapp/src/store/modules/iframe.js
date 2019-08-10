export default {
  state: {
    iframeUrl: [],//当前嵌套页面路由路径
    iframeUrls: [] // 所有嵌套页面路由路径访问URL
  },
  getters: {
  },
  mutations:{
    setIFrameUrl(state,iframeUrl){
      state.iframeUrl = iframeUrl
    },
    addIFrameUrl(state,iframeUrl){
      state.iframeUrls.add(iframeUrl);
    },
    actions: {
    }
  }
}
