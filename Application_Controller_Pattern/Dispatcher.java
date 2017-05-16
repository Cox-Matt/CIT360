/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppConPat;

/**
 *
 * @author Matthew
 */
public class Dispatcher {
    private Brooklyn99Rev Brooklyn99;
    private BigBangRev BigBang;
    private ModernFamilyRev ModernFamily;
    private errorMes errorM;
    public Dispatcher(){
        Brooklyn99 = new Brooklyn99Rev();
        BigBang = new BigBangRev();
        ModernFamily = new ModernFamilyRev();
        errorM = new errorMes();
    }
    public void dispatch(String request){
        if(request.equalsIgnoreCase("Brooklyn99")){
            Brooklyn99.show();
        }else if(request.equalsIgnoreCase("BigBang")){
            BigBang.show();
        }else if(request.equalsIgnoreCase("ModernFamily")){
            ModernFamily.show();
        }else{
            errorM.show();
        }
    }
}
