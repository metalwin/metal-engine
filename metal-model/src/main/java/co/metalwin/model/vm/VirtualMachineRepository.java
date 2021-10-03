package co.metalwin.model.vm;

import co.metalwin.model.BaseRepository;
import jooq.generated.metalwin.Tables;
import jooq.generated.metalwin.tables.records.VmsRecord;
import lombok.NonNull;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 *
 */
public class VirtualMachineRepository extends BaseRepository {
    public VirtualMachineRepository() {
        super(DSL.using(SQLDialect.POSTGRES));
    }

    @NonNull
    public String create(VmsRecord vmRecord) {
        return context.insertInto(Tables.VMS)
            .set(vmRecord)
            .getSQL();
    }
}
