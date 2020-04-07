/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Location.LocationPoint;
/**
 *
 * @author Mayank
 */
public class ReportingAdminSceneRequest extends WorkRequest{
    
    private String sceneName;
    private String sceneId;
    private int noOfVictims;
    private String estimatedLoss;
    private String sceneZipcode;
    private LocationPoint sceneLocationPoint;

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
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
    
}
