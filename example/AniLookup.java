import com.zaloni.bedrock.assets.lookup.LookupService;
import com.zaloni.bedrock.assets.exception.LookupException;
import com.zaloni.bedrock.assets.vo.LookupRequest;
import com.zaloni.bedrock.assets.vo.LookupResponse;
import com.zaloni.bedrock.assets.vo.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class AniLookup implements LookupService {
    public Object fetchObjectDetails(String... arg0) {
        // TODO Auto-generated method stub
        return null;
    }
    public List<String> getIndexStorage() {
        return new ArrayList<String>(Arrays.asList("name", "description"));
    }
    public List<String> getSearchableAttributes() {
        // TODO Auto-generated method stub
        return null;
    }
    public Schema getSchema() {
        // TODO Auto-generated method stub
        return null;
    }
    public String getType() {
        // TODO Auto-generated method stub
        return "New_Interface";
    }
    public <U extends LookupRequest> LookupResponse doLookup(U lookupRequest) throws LookupException {
        List<Table1> listTable = new ArrayList<AniLookup.Table1>();
        Table1 t1=new Table1();
        t1.setId(1);
        t1.setTableName("entity");
        listTable.add(t1);
        Table1 t2=new Table1();
        t2.setId(2);
        t2.setTableName("workflow");
        listTable.add(t2);
        Table1 t3=new Table1();
        t3.setId(3);
        t3.setTableName("dq_rules");
        listTable.add(t3);
        Table1 t4=new Table1();
        t4.setId(4);
        t4.setTableName("Connection");
        listTable.add(t4);
        Table1 t5=new Table1();
        t5.setId(1);
        t5.setTableName("entity1");
        listTable.add(t5);
        String input=lookupRequest.getSearchString();
        LookupResponse response=new LookupResponse();
        response.setChunkSize(lookupRequest.getChunkSize());
        response.setCurrentPage(lookupRequest.getCurrentPage());
        response.setLabel("tableName");
        List<HashMap<String,Object>> items=new ArrayList<HashMap<String,Object>>();
        for(Table1 table:listTable) {
            if(table.getTableName().contains(input)){
                HashMap<String,Object> item=new HashMap<String,Object>();
                item.put("id",table.getId());
                item.put("tableName",table.getTableName());
                items.add(item);
            }
        }
        response.setItems(items);
        response.setTotalRecords(items.size());
        return response;
    }
    public class Table1{
        private int id;
        private String tableName;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id=id;
        }
        public String getTableName() {
            return tableName;
        }
        public void setTableName(String tableName) {
            this.tableName=tableName;
        }
    }
    }