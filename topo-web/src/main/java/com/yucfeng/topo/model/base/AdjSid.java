package com.yucfeng.topo.model.base;

public class AdjSid {

    private Integer value;
    private Integer weight;
    private String flags;
    private String nei_or_sys_id;

    public AdjSid() {
        super();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getNei_or_sys_id() {
        return nei_or_sys_id;
    }

    public void setNei_or_sys_id(String nei_or_sys_id) {
        this.nei_or_sys_id = nei_or_sys_id;
    }

    @Override
    public String toString() {
        return "AdjSid [value=" + value + ", weight=" + weight + ", flags=" + flags + ", nei_or_sys_id=" + nei_or_sys_id
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime * result + ((nei_or_sys_id == null) ? 0 : nei_or_sys_id.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AdjSid other = (AdjSid) obj;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if (nei_or_sys_id == null) {
            if (other.nei_or_sys_id != null)
                return false;
        } else if (!nei_or_sys_id.equals(other.nei_or_sys_id))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (weight == null) {
            if (other.weight != null)
                return false;
        } else if (!weight.equals(other.weight))
            return false;
        return true;
    }
}
