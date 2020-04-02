package my.plugin;
import org.apache.http.Header;
import org.apache.jmeter.protocol.http.control.CacheManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

public class Library extends CacheManager {
    private static final Logger log =
            LoggerFactory.getLogger(Library.class);

    public Library() {
        super();
        log.info("MyCache created");
    }

    @Override
    public boolean inCache(URL url, Header[] allHeaders) {
        log.info("MyCache.inCache called");
        return super.inCache(url, allHeaders);
    }

    @Override
    public boolean inCache(URL url, org.apache.jmeter.protocol.http.control.Header[] allHeaders) {
        log.info("MyCache.inCache called");
        return super.inCache(url, allHeaders);
    }

    @Override
    public void clear() {
        log.info("MyCache.clear called");
        super.clear();
    }

    @Override
    public void testStarted() {
        log.info("MyCache.testStarted called");
        super.testStarted();
    }

    @Override
    public void testEnded() {
        log.info("MyCache.testEnded called");
        super.testEnded();
    }
}
