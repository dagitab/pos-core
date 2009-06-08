package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base entity class with ID field
 * 
 * @author "James Faeldon"
 *
 */
@MappedSuperclass
public class BaseEntity extends BaseObject implements Serializable {
	
	private static final long serialVersionUID = 2255942806694227924L;
	private Long id;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!BaseEntity.class.isAssignableFrom(o.getClass())) {
        	return false;
        }
        if (!getClass().isInstance(o)) {
            return false;
        }

        final BaseEntity entity = (BaseEntity) o;

        return !(id != null ? !id.equals(entity.getId()) : entity.getId() != null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
        return (id != null ? id.hashCode() : 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return getClass().getName()+"("+id+")";
	}
}
