package script.db

databaseChangeLog(logicalFilePath: 'asgard_quartz.groovy') {
    changeSet(id: '2018-09-06-create-tables-asgard_quartz', author: 'jcalaz@163.com') {
        if(helper.isOracle()) {
            sqlFile(path: './quartz_oracle.sql', relativeToChangelogFile: true, stripComments: true)
        } else {
            sqlFile(path: './quartz.sql', relativeToChangelogFile: true, stripComments: true)
        }
    }
}
