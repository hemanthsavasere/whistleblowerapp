// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.appinventor.components.runtime;

import java.io.PrintStream;

// Referenced classes of package com.google.appinventor.components.runtime:
//            HVArrangement, AndroidViewComponent

class val.fHeight
    implements Runnable
{

    final HVArrangement this$0;
    final AndroidViewComponent val$component;
    final int val$fHeight;

    public void run()
    {
        System.err.println("(HVArrangement)Height not stable yet... trying again");
        setChildHeight(val$component, val$fHeight);
    }

    nent()
    {
        this$0 = final_hvarrangement;
        val$component = androidviewcomponent;
        val$fHeight = I.this;
        super();
    }
}
