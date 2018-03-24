package io.ooc.project.Repository;

import io.ooc.project.Model.Category;
import io.ooc.project.Model.billable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Havensbee on 3/19/18.
 */
public interface BillableRepository extends JpaRepository<billable, Long>  {
}
