package com.yucfeng.topo.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.Property;

public class NodeAttribute {

    @Property(name = "as_num")
    @JsonProperty("as_num")
    protected Long asNum;
    protected Long protocolId;
    protected Long instancesId;
    protected String areaId;

    @Property(name = "node_name")
    @JsonProperty("node_name")
    protected String nodeName;
    protected String nodeMsd;
    protected String nodeFlags;
    protected String nodeSid;
    protected String nodeLabel;

    protected String bgplsId;
    protected String igpRouterId;
    @Property(name = "local_router_id")
    @JsonProperty("local_router_id")
    protected String localRouterId;
    protected String srCapabilityFlag;
    protected String yabgpContainerId;

    public Long getAsNum() {
        return asNum;
    }

    public void setAsNum(Long asNum) {
        this.asNum = asNum;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public Long getInstancesId() {
        return instancesId;
    }

    public void setInstancesId(Long instancesId) {
        this.instancesId = instancesId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeMsd() {
        return nodeMsd;
    }

    public void setNodeMsd(String nodeMsd) {
        this.nodeMsd = nodeMsd;
    }

    public String getNodeFlags() {
        return nodeFlags;
    }

    public void setNodeFlags(String nodeFlags) {
        this.nodeFlags = nodeFlags;
    }

    public String getNodeSid() {
        return nodeSid;
    }

    public void setNodeSid(String nodeSid) {
        this.nodeSid = nodeSid;
    }

    public String getNodeLabel() {
        return nodeLabel;
    }

    public void setNodeLabel(String nodeLabel) {
        this.nodeLabel = nodeLabel;
    }

    public String getBgplsId() {
        return bgplsId;
    }

    public void setBgplsId(String bgplsId) {
        this.bgplsId = bgplsId;
    }

    public String getIgpRouterId() {
        return igpRouterId;
    }

    public void setIgpRouterId(String igpRouterId) {
        this.igpRouterId = igpRouterId;
    }

    public String getLocalRouterId() {
        return localRouterId;
    }

    public void setLocalRouterId(String localRouterId) {
        this.localRouterId = localRouterId;
    }

    public String getSrCapabilityFlag() {
        return srCapabilityFlag;
    }

    public void setSrCapabilityFlag(String srCapabilityFlag) {
        this.srCapabilityFlag = srCapabilityFlag;
    }

    public String getYabgpContainerId() {
        return yabgpContainerId;
    }

    public void setYabgpContainerId(String yabgpContainerId) {
        this.yabgpContainerId = yabgpContainerId;
    }

    @Override
    public String toString() {
        return "NodeAttribute{" +
                "asNum=" + asNum +
                ", protocolId=" + protocolId +
                ", instancesId=" + instancesId +
                ", areaId='" + areaId + '\'' +
                ", nodeName='" + nodeName + '\'' +
                ", nodeMsd='" + nodeMsd + '\'' +
                ", nodeFlags='" + nodeFlags + '\'' +
                ", nodeSid='" + nodeSid + '\'' +
                ", nodeLabel='" + nodeLabel + '\'' +
                ", bgplsId='" + bgplsId + '\'' +
                ", igpRouterId='" + igpRouterId + '\'' +
                ", localRouterId='" + localRouterId + '\'' +
                ", srCapabilityFlag='" + srCapabilityFlag + '\'' +
                ", yabgpContainerId='" + yabgpContainerId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NodeAttribute that = (NodeAttribute) o;

        if (asNum != null ? !asNum.equals(that.asNum) : that.asNum != null) return false;
        if (protocolId != null ? !protocolId.equals(that.protocolId) : that.protocolId != null) return false;
        if (instancesId != null ? !instancesId.equals(that.instancesId) : that.instancesId != null) return false;
        if (areaId != null ? !areaId.equals(that.areaId) : that.areaId != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
        if (nodeMsd != null ? !nodeMsd.equals(that.nodeMsd) : that.nodeMsd != null) return false;
        if (nodeFlags != null ? !nodeFlags.equals(that.nodeFlags) : that.nodeFlags != null) return false;
        if (nodeSid != null ? !nodeSid.equals(that.nodeSid) : that.nodeSid != null) return false;
        if (nodeLabel != null ? !nodeLabel.equals(that.nodeLabel) : that.nodeLabel != null) return false;
        if (bgplsId != null ? !bgplsId.equals(that.bgplsId) : that.bgplsId != null) return false;
        if (igpRouterId != null ? !igpRouterId.equals(that.igpRouterId) : that.igpRouterId != null) return false;
        if (localRouterId != null ? !localRouterId.equals(that.localRouterId) : that.localRouterId != null)
            return false;
        if (srCapabilityFlag != null ? !srCapabilityFlag.equals(that.srCapabilityFlag) : that.srCapabilityFlag != null)
            return false;
        return yabgpContainerId != null ? yabgpContainerId.equals(that.yabgpContainerId) : that.yabgpContainerId == null;
    }

    @Override
    public int hashCode() {
        int result = asNum != null ? asNum.hashCode() : 0;
        result = 31 * result + (protocolId != null ? protocolId.hashCode() : 0);
        result = 31 * result + (instancesId != null ? instancesId.hashCode() : 0);
        result = 31 * result + (areaId != null ? areaId.hashCode() : 0);
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (nodeMsd != null ? nodeMsd.hashCode() : 0);
        result = 31 * result + (nodeFlags != null ? nodeFlags.hashCode() : 0);
        result = 31 * result + (nodeSid != null ? nodeSid.hashCode() : 0);
        result = 31 * result + (nodeLabel != null ? nodeLabel.hashCode() : 0);
        result = 31 * result + (bgplsId != null ? bgplsId.hashCode() : 0);
        result = 31 * result + (igpRouterId != null ? igpRouterId.hashCode() : 0);
        result = 31 * result + (localRouterId != null ? localRouterId.hashCode() : 0);
        result = 31 * result + (srCapabilityFlag != null ? srCapabilityFlag.hashCode() : 0);
        result = 31 * result + (yabgpContainerId != null ? yabgpContainerId.hashCode() : 0);
        return result;
    }
}
