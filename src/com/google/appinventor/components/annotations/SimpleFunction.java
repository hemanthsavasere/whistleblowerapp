// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.appinventor.components.annotations;

import java.lang.annotation.Annotation;

public interface SimpleFunction
    extends Annotation
{

    public abstract String description();

    public abstract boolean userVisible();
}