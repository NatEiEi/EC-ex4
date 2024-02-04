package mybeans;

import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanRemote {

    @Override
    public float fToC(float F) {
        float C = (5.0f/9.0f) * (F -32);
        return C;
    }
}
