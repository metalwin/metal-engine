package co.metalwin.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;

@Getter
@RequiredArgsConstructor
public abstract class BaseRepository {
    protected final DSLContext context;
}
