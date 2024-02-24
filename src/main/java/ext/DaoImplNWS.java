package ext;

import doa.IDao;

import java.util.logging.Logger;

public class DaoImplNWS  implements IDao {

    private final Logger logger = Logger.getLogger(DaoImplNWS.class.getName());
    @Override
    public double getData() {
        logger.info("Version web services");
        return 90;
    }
}
