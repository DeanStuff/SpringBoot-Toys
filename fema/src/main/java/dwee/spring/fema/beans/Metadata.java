package dwee.spring.fema.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;

/**
 * Created by dean on 5/14/20.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

    private String  skip;
    private int     top;
    private int     count;
    private String  filter;
    private String  format;
    private Boolean metadata;
    private HashMap<String, Integer> orderby;
    private String  select;
    private String  entityname;
    private String  version;
    private String  url;
    private String  rundate;

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getMetadata() {
        return metadata;
    }

    public void setMetadata(Boolean metadata) {
        this.metadata = metadata;
    }

    public HashMap<String, Integer> getOrderby() {
        return orderby;
    }

    public void setOrderby(HashMap<String, Integer> orderby) {
        this.orderby = orderby;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getEntityname() {
        return entityname;
    }

    public void setEntityname(String entityname) {
        this.entityname = entityname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRundate() {
        return rundate;
    }

    public void setRundate(String rundate)
    {
        this.rundate = rundate;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "skip='" + skip + '\'' +
                ", top=" + top +
                ", count=" + count +
                ", filter='" + filter + '\'' +
                ", format='" + format + '\'' +
                ", metadata=" + metadata +
                ", orderby=" + orderby +
                ", select='" + select + '\'' +
                ", entityname='" + entityname + '\'' +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", rundate='" + rundate + '\'' +
                '}';
    }
}
