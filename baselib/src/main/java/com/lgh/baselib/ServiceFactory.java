package com.lgh.baselib;

/**
 * Created by Li Guan Hui on 2019/4/25 15:19
 * 难写的代码，肯定很难读。因此，我没有注释留给你。
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ServiceFactory() {
    }

    private ILoginService iLoginService;
    private IRegisterService iRegisterService;

    public ILoginService getiLoginService() {
        return iLoginService;
    }

    public void setiLoginService(ILoginService iLoginService) {
        this.iLoginService = iLoginService;
    }

    public IRegisterService getiRegisterService() {
        return iRegisterService;
    }

    public void setiRegisterService(IRegisterService iRegisterService) {
        this.iRegisterService = iRegisterService;
    }
}
