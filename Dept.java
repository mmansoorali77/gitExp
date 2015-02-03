/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mansoorali of Australia Newzealand:
 * salman ali
 * :wq
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name="departments")
public class Departments   implements Serializable{
   
    @Id
    @Column(name="dept_no", columnDefinition = "CHAR(4)")
    private String  strDept_No;
    
    @Column(name="dept_name", columnDefinition = "VARCHAR(50)")
    private String  strDept_Name;
    
    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
    Collection<Dept_Emp> dept_emp = new ArrayList<Dept_Emp>();
    
    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
    Collection<Dept_Manager> dept_mgr = new ArrayList<Dept_Manager>();

    @Override
    public String toString() {
        
        return (String) (
                            this.getStrDept_No()  +","+
                            this.getStrDept_Name()
                );
    }
    
    public String getStrDept_No() {
        return strDept_No;
    }

    public void setStrDept_No(String strDept_No) {
        this.strDept_No = strDept_No;
    }

    public String getStrDept_Name() {
        return strDept_Name;
    }

    public void setStrDept_Name(String strDept_Name) {
        this.strDept_Name = strDept_Name;
    }

    public Collection<Dept_Emp> getDept_emp() {
        return dept_emp;
    }

    public void setDept_emp(Collection<Dept_Emp> dept_emp) {
        this.dept_emp = dept_emp;
    }

    public Collection<Dept_Manager> getDept_mgr() {
        return dept_mgr;
    }

    public void setDept_mgr(Collection<Dept_Manager> dept_mgr) {
        this.dept_mgr = dept_mgr;
    }
    
    
    
}
