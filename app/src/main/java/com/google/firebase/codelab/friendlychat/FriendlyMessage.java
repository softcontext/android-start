/**
 * Copyright Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.codelab.friendlychat;

public class FriendlyMessage {

    private String id;
    private String text;
    private String name;

    // 사용자 이미지
    // "https://lh5.googleusercontent.com/
    // -RHsvhWZq2I8/AAAAAAAAAAI/AAAAAAAAAGg/dRz4kYO_E3c/s96-c/photo.jpg"
    private String photoUrl;

    // 업로드 이미지
    // "https://firebasestorage.googleapis.com/v0/b/friendlychat-1bf90.appspot.com/
    // o/Jauke3QzcAY2wB4wU7UtCk3nJaM2%2F-Kv7amVauMbn4BW6LUgX%2Fimage%3A21790
    // ?alt=media&token=4cac639e-2aa3-4e0f-992f-9fbd09c30f2c"
    private String imageUrl;

    public FriendlyMessage() {
    }

    public FriendlyMessage(String text, String name, String photoUrl, String imageUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
