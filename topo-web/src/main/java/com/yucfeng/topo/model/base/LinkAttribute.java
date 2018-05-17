package com.yucfeng.topo.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.Property;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class LinkAttribute {

    @NotNull
    @Property(name = "local_node_id")
    @JsonProperty("local_node_id")
    protected String localNodeId;

    @NotNull
    @Property(name = "remote_node_id")
    @JsonProperty("remote_node_id")
    protected String remoteNodeId;

    @Property(name = "link_local_ipv4")
    @JsonProperty("link_local_ipv4")
    protected String linkLocalIpv4;
    @Property(name = "link_remote_ipv4")
    @JsonProperty("link_remote_ipv4")
    protected String linkRemoteIpv4;

    protected Long adminGroup;
    protected Long teMetric;
    protected Long igpMetric;
    protected Long localIdentifier;
    protected Long remoteIdentifier;

    protected String linkMsd;
    protected String linkName;

    protected Long maxBandwidth;
    protected Long maxRsvBandwidth;
    protected String unrsvBandwidth;
    protected List<String> srlgGroup = new ArrayList<String>();

    protected String mplsMask;
    protected String protectionType;
//    @Property(name = "ls_adj_sid")
//    @JsonProperty("ls_adj_sid")
//    protected List<AdjSid> lsAdjSid = new ArrayList<AdjSid>();
//    protected List<AdjSid> lsLanAdjSid = new ArrayList<AdjSid>();
//    protected List<AdjSid> lsPeerAdjSid = new ArrayList<AdjSid>();
//    protected List<AdjSid> lsPeerNodeAdjSid = new ArrayList<AdjSid>();

    public String getLocalNodeId() {
        return localNodeId;
    }

    public void setLocalNodeId(String localNodeId) {
        this.localNodeId = localNodeId;
    }

    public String getRemoteNodeId() {
        return remoteNodeId;
    }

    public void setRemoteNodeId(String remoteNodeId) {
        this.remoteNodeId = remoteNodeId;
    }

    public String getLinkLocalIpv4() {
        return linkLocalIpv4;
    }

    public void setLinkLocalIpv4(String linkLocalIpv4) {
        this.linkLocalIpv4 = linkLocalIpv4;
    }

    public String getLinkRemoteIpv4() {
        return linkRemoteIpv4;
    }

    public void setLinkRemoteIpv4(String linkRemoteIpv4) {
        this.linkRemoteIpv4 = linkRemoteIpv4;
    }

    public Long getAdminGroup() {
        return adminGroup;
    }

    public void setAdminGroup(Long adminGroup) {
        this.adminGroup = adminGroup;
    }

    public Long getTeMetric() {
        return teMetric;
    }

    public void setTeMetric(Long teMetric) {
        this.teMetric = teMetric;
    }

    public Long getIgpMetric() {
        return igpMetric;
    }

    public void setIgpMetric(Long igpMetric) {
        this.igpMetric = igpMetric;
    }

    public Long getLocalIdentifier() {
        return localIdentifier;
    }

    public void setLocalIdentifier(Long localIdentifier) {
        this.localIdentifier = localIdentifier;
    }

    public Long getRemoteIdentifier() {
        return remoteIdentifier;
    }

    public void setRemoteIdentifier(Long remoteIdentifier) {
        this.remoteIdentifier = remoteIdentifier;
    }

    public String getLinkMsd() {
        return linkMsd;
    }

    public void setLinkMsd(String linkMsd) {
        this.linkMsd = linkMsd;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public Long getMaxRsvBandwidth() {
        return maxRsvBandwidth;
    }

    public void setMaxRsvBandwidth(Long maxRsvBandwidth) {
        this.maxRsvBandwidth = maxRsvBandwidth;
    }

    public String getUnrsvBandwidth() {
        return unrsvBandwidth;
    }

    public void setUnrsvBandwidth(String unrsvBandwidth) {
        this.unrsvBandwidth = unrsvBandwidth;
    }

    public List<String> getSrlgGroup() {
        return srlgGroup;
    }

    public void setSrlgGroup(List<String> srlgGroup) {
        this.srlgGroup = srlgGroup;
    }

    public String getMplsMask() {
        return mplsMask;
    }

    public void setMplsMask(String mplsMask) {
        this.mplsMask = mplsMask;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }

//    public List<AdjSid> getLsAdjSid() {
//        return lsAdjSid;
//    }
//
//    public void setLsAdjSid(List<AdjSid> lsAdjSid) {
//        this.lsAdjSid = lsAdjSid;
//    }
//
//    public List<AdjSid> getLsLanAdjSid() {
//        return lsLanAdjSid;
//    }
//
//    public void setLsLanAdjSid(List<AdjSid> lsLanAdjSid) {
//        this.lsLanAdjSid = lsLanAdjSid;
//    }
//
//    public List<AdjSid> getLsPeerAdjSid() {
//        return lsPeerAdjSid;
//    }
//
//    public void setLsPeerAdjSid(List<AdjSid> lsPeerAdjSid) {
//        this.lsPeerAdjSid = lsPeerAdjSid;
//    }
//
//    public List<AdjSid> getLsPeerNodeAdjSid() {
//        return lsPeerNodeAdjSid;
//    }
//
//    public void setLsPeerNodeAdjSid(List<AdjSid> lsPeerNodeAdjSid) {
//        this.lsPeerNodeAdjSid = lsPeerNodeAdjSid;
//    }
//
//    @Override
//    public String toString() {
//        return "LinkAttribute{" +
//                "localNodeId='" + localNodeId + '\'' +
//                ", remoteNodeId='" + remoteNodeId + '\'' +
//                ", linkLocalIpv4='" + linkLocalIpv4 + '\'' +
//                ", linkRemoteIpv4='" + linkRemoteIpv4 + '\'' +
//                ", adminGroup=" + adminGroup +
//                ", teMetric=" + teMetric +
//                ", igpMetric=" + igpMetric +
//                ", localIdentifier=" + localIdentifier +
//                ", remoteIdentifier=" + remoteIdentifier +
//                ", linkMsd='" + linkMsd + '\'' +
//                ", linkName='" + linkName + '\'' +
//                ", maxBandwidth=" + maxBandwidth +
//                ", maxRsvBandwidth=" + maxRsvBandwidth +
//                ", unrsvBandwidth='" + unrsvBandwidth + '\'' +
//                ", srlgGroup=" + srlgGroup +
//                ", mplsMask='" + mplsMask + '\'' +
//                ", protectionType='" + protectionType + '\'' +
//                ", lsAdjSid=" + lsAdjSid +
//                ", lsLanAdjSid=" + lsLanAdjSid +
//                ", lsPeerAdjSid=" + lsPeerAdjSid +
//                ", lsPeerNodeAdjSid=" + lsPeerNodeAdjSid +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        LinkAttribute that = (LinkAttribute) o;
//
//        if (localNodeId != null ? !localNodeId.equals(that.localNodeId) : that.localNodeId != null) return false;
//        if (remoteNodeId != null ? !remoteNodeId.equals(that.remoteNodeId) : that.remoteNodeId != null) return false;
//        if (linkLocalIpv4 != null ? !linkLocalIpv4.equals(that.linkLocalIpv4) : that.linkLocalIpv4 != null)
//            return false;
//        if (linkRemoteIpv4 != null ? !linkRemoteIpv4.equals(that.linkRemoteIpv4) : that.linkRemoteIpv4 != null)
//            return false;
//        if (adminGroup != null ? !adminGroup.equals(that.adminGroup) : that.adminGroup != null) return false;
//        if (teMetric != null ? !teMetric.equals(that.teMetric) : that.teMetric != null) return false;
//        if (igpMetric != null ? !igpMetric.equals(that.igpMetric) : that.igpMetric != null) return false;
//        if (localIdentifier != null ? !localIdentifier.equals(that.localIdentifier) : that.localIdentifier != null)
//            return false;
//        if (remoteIdentifier != null ? !remoteIdentifier.equals(that.remoteIdentifier) : that.remoteIdentifier != null)
//            return false;
//        if (linkMsd != null ? !linkMsd.equals(that.linkMsd) : that.linkMsd != null) return false;
//        if (linkName != null ? !linkName.equals(that.linkName) : that.linkName != null) return false;
//        if (maxBandwidth != null ? !maxBandwidth.equals(that.maxBandwidth) : that.maxBandwidth != null) return false;
//        if (maxRsvBandwidth != null ? !maxRsvBandwidth.equals(that.maxRsvBandwidth) : that.maxRsvBandwidth != null)
//            return false;
//        if (unrsvBandwidth != null ? !unrsvBandwidth.equals(that.unrsvBandwidth) : that.unrsvBandwidth != null)
//            return false;
//        if (srlgGroup != null ? !srlgGroup.equals(that.srlgGroup) : that.srlgGroup != null) return false;
//        if (mplsMask != null ? !mplsMask.equals(that.mplsMask) : that.mplsMask != null) return false;
//        if (protectionType != null ? !protectionType.equals(that.protectionType) : that.protectionType != null)
//            return false;
//        if (lsAdjSid != null ? !lsAdjSid.equals(that.lsAdjSid) : that.lsAdjSid != null) return false;
//        if (lsLanAdjSid != null ? !lsLanAdjSid.equals(that.lsLanAdjSid) : that.lsLanAdjSid != null) return false;
//        if (lsPeerAdjSid != null ? !lsPeerAdjSid.equals(that.lsPeerAdjSid) : that.lsPeerAdjSid != null) return false;
//        return lsPeerNodeAdjSid != null ? lsPeerNodeAdjSid.equals(that.lsPeerNodeAdjSid) : that.lsPeerNodeAdjSid == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = localNodeId != null ? localNodeId.hashCode() : 0;
//        result = 31 * result + (remoteNodeId != null ? remoteNodeId.hashCode() : 0);
//        result = 31 * result + (linkLocalIpv4 != null ? linkLocalIpv4.hashCode() : 0);
//        result = 31 * result + (linkRemoteIpv4 != null ? linkRemoteIpv4.hashCode() : 0);
//        result = 31 * result + (adminGroup != null ? adminGroup.hashCode() : 0);
//        result = 31 * result + (teMetric != null ? teMetric.hashCode() : 0);
//        result = 31 * result + (igpMetric != null ? igpMetric.hashCode() : 0);
//        result = 31 * result + (localIdentifier != null ? localIdentifier.hashCode() : 0);
//        result = 31 * result + (remoteIdentifier != null ? remoteIdentifier.hashCode() : 0);
//        result = 31 * result + (linkMsd != null ? linkMsd.hashCode() : 0);
//        result = 31 * result + (linkName != null ? linkName.hashCode() : 0);
//        result = 31 * result + (maxBandwidth != null ? maxBandwidth.hashCode() : 0);
//        result = 31 * result + (maxRsvBandwidth != null ? maxRsvBandwidth.hashCode() : 0);
//        result = 31 * result + (unrsvBandwidth != null ? unrsvBandwidth.hashCode() : 0);
//        result = 31 * result + (srlgGroup != null ? srlgGroup.hashCode() : 0);
//        result = 31 * result + (mplsMask != null ? mplsMask.hashCode() : 0);
//        result = 31 * result + (protectionType != null ? protectionType.hashCode() : 0);
//        result = 31 * result + (lsAdjSid != null ? lsAdjSid.hashCode() : 0);
//        result = 31 * result + (lsLanAdjSid != null ? lsLanAdjSid.hashCode() : 0);
//        result = 31 * result + (lsPeerAdjSid != null ? lsPeerAdjSid.hashCode() : 0);
//        result = 31 * result + (lsPeerNodeAdjSid != null ? lsPeerNodeAdjSid.hashCode() : 0);
//        return result;
//    }
}
