/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Location.LocationPoint;
import Business.Network.Network;
import Business.Organization.Organization;

/**
 *
 * @author Mayank
 */
public class EmergencyUnitRequest extends WorkRequest{
    
    private Organization senderOrganization;
    private Organization recieverOrganization;
    private Network senderNetwork;
    private Network recieverNetwork;
    private String requirements;
    private String sceneId;
    private String sceneName;
    private int noOfVictims;
    private String estimatedLoss;
    private String sceneZipcode;
    private LocationPoint sceneLocationPoint;
    private Employee sceneManager;
    private String imagePath;
    private String emergencyReqId;
    //private boolean considerInGraph = true;
    int min = 100;
    int max = 999;
    
    public EmergencyUnitRequest() {
        int randomNum = (int)(Math.random() * (max - min + 1) + min);
        emergencyReqId = "ER"+randomNum;
    }
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Organization getSenderOrganization() {
        return senderOrganization;
    }

    public void setSenderOrganization(Organization senderOrganization) {
        this.senderOrganization = senderOrganization;
    }

    public Organization getRecieverOrganization() {
        return recieverOrganization;
    }

    public void setRecieverOrganization(Organization recieverOrganization) {
        this.recieverOrganization = recieverOrganization;
    }

    public Network getSenderNetwork() {
        return senderNetwork;
    }

    public void setSenderNetwork(Network senderNetwork) {
        this.senderNetwork = senderNetwork;
    }

    public Network getRecieverNetwork() {
        return recieverNetwork;
    }

    public void setRecieverNetwork(Network recieverNetwork) {
        this.recieverNetwork = recieverNetwork;
    }

//    public boolean isConsiderInGraph() {
//        return considerInGraph;
//    }
//
//    public void setConsiderInGraph(boolean considerInGraph) {
//        this.considerInGraph = considerInGraph;
//    }


    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public int getNoOfVictims() {
        return noOfVictims;
    }

    public void setNoOfVictims(int noOfVictims) {
        this.noOfVictims = noOfVictims;
    }

    public String getEstimatedLoss() {
        return estimatedLoss;
    }

    public void setEstimatedLoss(String estimatedLoss) {
        this.estimatedLoss = estimatedLoss;
    }

    public String getSceneZipcode() {
        return sceneZipcode;
    }

    public void setSceneZipcode(String sceneZipcode) {
        this.sceneZipcode = sceneZipcode;
    }

    public LocationPoint getSceneLocationPoint() {
        return sceneLocationPoint;
    }

    public void setSceneLocationPoint(LocationPoint sceneLocationPoint) {
        this.sceneLocationPoint = sceneLocationPoint;
    }

    public Employee getSceneManager() {
        return sceneManager;
    }

    public void setSceneManager(Employee sceneManager) {
        this.sceneManager = sceneManager;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getEmergencyReqId() {
        return emergencyReqId;
    }

    public void setEmergencyReqId(String emergencyReqId) {
        this.emergencyReqId = emergencyReqId;
    }

    @Override
    public String toString() {
        return emergencyReqId;
    }

    
}