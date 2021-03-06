/**
 * Copyright Google Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.invogen.messagingapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Map;

public class FriendlyMessage implements Serializable {

    private String senderId;
    private String senderName;
    private String msgDate;
    private String msgType;
    private String msgText;
    private boolean isRemoved;
    private String removedBy;

    private Map<String, FileMessageAttributes> fileMessageAttributesMap;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String senderId, String senderName, String msgType, String msgText) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.msgType = msgType;
        this.msgText = msgText;
        this.msgDate = AppUtils.getTime();
    }

    public FriendlyMessage(String senderId, String senderName, String msgType,
                           Map<String, FileMessageAttributes> fileMessageAttributesMap) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.msgDate = AppUtils.getTime();
        this.msgType = msgType;
        this.fileMessageAttributesMap = fileMessageAttributesMap;
    }

//    public FriendlyMessage(String senderId, String senderName, String msgType,
//                           boolean isRemoved, String msgText, String removedBy) {
//        this.senderId = senderId;
//        this.senderName = senderName;
//        this.msgDate = AppUtils.getTime();
//        this.msgType = msgType;
//        this.msgText = msgText;
//        this.isRemoved = isRemoved;
//        this.removedBy = removedBy;
//    }''

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(String msgDate) {
        this.msgDate = msgDate;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public boolean getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(boolean removed) {
        isRemoved = removed;
    }

    public String getRemovedBy() {
        return removedBy;
    }

    public void setRemovedBy(String removedBy) {
        this.removedBy = removedBy;
    }

    public Map<String, FileMessageAttributes> getFileMessageAttributesMap() {
        return fileMessageAttributesMap;
    }

    public void setFileMessageAttributesMap(Map<String, FileMessageAttributes> fileMessageAttributesMap) {
        this.fileMessageAttributesMap = fileMessageAttributesMap;
    }

}