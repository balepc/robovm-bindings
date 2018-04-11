/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mobidevelop.robovm.pods.mopub;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPTelephoneConfirmationController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAlertViewDelegate/*</implements>*/ {

    /*<ptr>*/public static class MPTelephoneConfirmationControllerPtr extends Ptr<MPTelephoneConfirmationController, MPTelephoneConfirmationControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPTelephoneConfirmationController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPTelephoneConfirmationController() {}
    protected MPTelephoneConfirmationController(Handle h, long handle) { super(h, handle); }
    protected MPTelephoneConfirmationController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:clickHandler:")
    public MPTelephoneConfirmationController(NSURL url, @Block VoidBlock2<NSURL, Boolean> clickHandler) { super((SkipInit) null); initObject(initWithURL$clickHandler$(url, clickHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:clickHandler:")
    protected native @Pointer long initWithURL$clickHandler$(NSURL url, @Block VoidBlock2<NSURL, Boolean> clickHandler);
    @Method(selector = "show")
    public native void show();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "alertView:clickedButtonAtIndex:")
    public native void clicked(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "alertViewCancel:")
    public native void cancel(UIAlertView alertView);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "willPresentAlertView:")
    public native void willPresent(UIAlertView alertView);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "didPresentAlertView:")
    public native void didPresent(UIAlertView alertView);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "alertView:willDismissWithButtonIndex:")
    public native void willDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "alertView:didDismissWithButtonIndex:")
    public native void didDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    @Method(selector = "alertViewShouldEnableFirstOtherButton:")
    public native boolean shouldEnableFirstOtherButton(UIAlertView alertView);
    /*</methods>*/
}