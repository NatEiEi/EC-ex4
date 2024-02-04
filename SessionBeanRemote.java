package mybeans;

import javax.ejb.Remote;

@Remote
public interface SessionBeanRemote {

    float fToC(float F);
    
}
