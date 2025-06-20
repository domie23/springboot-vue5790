const base = {
    get() {
        return {
            url : "http://localhost:8080/fupinzhunong/",
            name: "fupinzhunong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/fupinzhunong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "扶贫助农系统"
        } 
    }
}
export default base
