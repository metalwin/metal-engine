package co.metalwin.model.vm;

import co.metalwin.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class VirtualMachine extends BaseModel {
    private String vmId;
    private String name;
}
