package org.apache.fineract.cn.reporting.internal.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fn_tbl_summary")
public class FnTableSummaryEntity {

    @Id
    private Long id;

}
