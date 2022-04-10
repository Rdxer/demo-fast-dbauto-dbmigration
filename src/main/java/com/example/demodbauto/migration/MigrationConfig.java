package com.example.demodbauto.migration;

import com.rdxer.db.migration.DBMigrationConfig;
import com.rdxer.db.migration.MigrationManager;
import com.rdxer.db.migration.core.ActionMigration;
import org.springframework.stereotype.Component;

@Component
public class MigrationConfig extends DBMigrationConfig {

    @Override
    public void config(MigrationManager migrationManager) {
        migrationManager.registerMigration(
//                FileMigration.of("v1","sql/v1.sql"),
                ActionMigration.of("添加管理员", (v, status) -> {

                   // TODO something

                    return true;
                })
        );
    }
}
