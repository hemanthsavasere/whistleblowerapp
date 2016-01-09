// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package appinventor.ai_hemanth_savasere.ball;

import com.google.appinventor.components.runtime.Ball;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

public class Screen1 extends Form
    implements Runnable
{

    static final SimpleSymbol Lit0 = (SimpleSymbol)(new SimpleSymbol("Screen1")).readResolve();
    static final SimpleSymbol Lit1 = (SimpleSymbol)(new SimpleSymbol("getMessage")).readResolve();
    static final SimpleSymbol Lit10;
    static final SimpleSymbol Lit11 = (SimpleSymbol)(new SimpleSymbol("Height")).readResolve();
    static final IntNum Lit12 = IntNum.make(-2);
    static final SimpleSymbol Lit13 = (SimpleSymbol)(new SimpleSymbol("Width")).readResolve();
    static final FString Lit14 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final FString Lit15 = new FString("com.google.appinventor.components.runtime.Ball");
    static final SimpleSymbol Lit16 = (SimpleSymbol)(new SimpleSymbol("Ball1")).readResolve();
    static final SimpleSymbol Lit17 = (SimpleSymbol)(new SimpleSymbol("Interval")).readResolve();
    static final IntNum Lit18 = IntNum.make(0);
    static final SimpleSymbol Lit19 = (SimpleSymbol)(new SimpleSymbol("Radius")).readResolve();
    static final SimpleSymbol Lit2 = (SimpleSymbol)(new SimpleSymbol("*the-null-value*")).readResolve();
    static final IntNum Lit20 = IntNum.make(10);
    static final SimpleSymbol Lit21 = (SimpleSymbol)(new SimpleSymbol("Speed")).readResolve();
    static final IntNum Lit22 = IntNum.make(5);
    static final SimpleSymbol Lit23 = (SimpleSymbol)(new SimpleSymbol("X")).readResolve();
    static final IntNum Lit24 = IntNum.make(147);
    static final SimpleSymbol Lit25 = (SimpleSymbol)(new SimpleSymbol("Y")).readResolve();
    static final IntNum Lit26 = IntNum.make(202);
    static final FString Lit27 = new FString("com.google.appinventor.components.runtime.Ball");
    static final SimpleSymbol Lit28 = (SimpleSymbol)(new SimpleSymbol("Heading")).readResolve();
    static final SimpleSymbol Lit29 = (SimpleSymbol)(new SimpleSymbol("Ball1$Flung")).readResolve();
    static final SimpleSymbol Lit3 = (SimpleSymbol)(new SimpleSymbol("AppName")).readResolve();
    static final SimpleSymbol Lit30 = (SimpleSymbol)(new SimpleSymbol("Flung")).readResolve();
    static final SimpleSymbol Lit31 = (SimpleSymbol)(new SimpleSymbol("Bounce")).readResolve();
    static final PairWithPosition Lit32;
    static final SimpleSymbol Lit33 = (SimpleSymbol)(new SimpleSymbol("Ball1$EdgeReached")).readResolve();
    static final SimpleSymbol Lit34 = (SimpleSymbol)(new SimpleSymbol("EdgeReached")).readResolve();
    static final SimpleSymbol Lit35 = (SimpleSymbol)(new SimpleSymbol("PointInDirection")).readResolve();
    static final PairWithPosition Lit36;
    static final SimpleSymbol Lit37 = (SimpleSymbol)(new SimpleSymbol("Ball1$Touched")).readResolve();
    static final SimpleSymbol Lit38 = (SimpleSymbol)(new SimpleSymbol("Touched")).readResolve();
    static final SimpleSymbol Lit39 = (SimpleSymbol)(new SimpleSymbol("android-log-form")).readResolve();
    static final SimpleSymbol Lit4 = (SimpleSymbol)(new SimpleSymbol("text")).readResolve();
    static final SimpleSymbol Lit40 = (SimpleSymbol)(new SimpleSymbol("add-to-form-environment")).readResolve();
    static final SimpleSymbol Lit41 = (SimpleSymbol)(new SimpleSymbol("lookup-in-form-environment")).readResolve();
    static final SimpleSymbol Lit42 = (SimpleSymbol)(new SimpleSymbol("is-bound-in-form-environment")).readResolve();
    static final SimpleSymbol Lit43 = (SimpleSymbol)(new SimpleSymbol("add-to-global-var-environment")).readResolve();
    static final SimpleSymbol Lit44 = (SimpleSymbol)(new SimpleSymbol("add-to-events")).readResolve();
    static final SimpleSymbol Lit45 = (SimpleSymbol)(new SimpleSymbol("add-to-components")).readResolve();
    static final SimpleSymbol Lit46 = (SimpleSymbol)(new SimpleSymbol("add-to-global-vars")).readResolve();
    static final SimpleSymbol Lit47 = (SimpleSymbol)(new SimpleSymbol("add-to-form-do-after-creation")).readResolve();
    static final SimpleSymbol Lit48 = (SimpleSymbol)(new SimpleSymbol("send-error")).readResolve();
    static final SimpleSymbol Lit49 = (SimpleSymbol)(new SimpleSymbol("dispatchEvent")).readResolve();
    static final SimpleSymbol Lit5 = (SimpleSymbol)(new SimpleSymbol("Title")).readResolve();
    static final SimpleSymbol Lit50 = (SimpleSymbol)(new SimpleSymbol("lookup-handler")).readResolve();
    static final FString Lit6 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit7 = (SimpleSymbol)(new SimpleSymbol("Canvas1")).readResolve();
    static final SimpleSymbol Lit8 = (SimpleSymbol)(new SimpleSymbol("BackgroundColor")).readResolve();
    static final IntNum Lit9;
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1;
    static final ModuleMethod lambda$Fn2;
    static final ModuleMethod lambda$Fn3;
    static final ModuleMethod lambda$Fn4;
    static final ModuleMethod lambda$Fn5;
    static final ModuleMethod lambda$Fn6;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Ball Ball1;
    public final ModuleMethod Ball1$EdgeReached;
    public final ModuleMethod Ball1$Flung;
    public final ModuleMethod Ball1$Touched;
    public Canvas Canvas1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    public Screen1()
    {
        ModuleInfo.register(this);
        frame frame1 = new frame();
        frame1.main = this;
        android$Mnlog$Mnform = new ModuleMethod(frame1, 1, Lit39, 4097);
        add$Mnto$Mnform$Mnenvironment = new ModuleMethod(frame1, 2, Lit40, 8194);
        lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame1, 3, Lit41, 8193);
        is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(frame1, 5, Lit42, 4097);
        add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(frame1, 6, Lit43, 8194);
        add$Mnto$Mnevents = new ModuleMethod(frame1, 7, Lit44, 8194);
        add$Mnto$Mncomponents = new ModuleMethod(frame1, 8, Lit45, 16388);
        add$Mnto$Mnglobal$Mnvars = new ModuleMethod(frame1, 9, Lit46, 8194);
        add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(frame1, 10, Lit47, 4097);
        send$Mnerror = new ModuleMethod(frame1, 11, Lit48, 4097);
        process$Mnexception = new ModuleMethod(frame1, 12, "process-exception", 4097);
        dispatchEvent = new ModuleMethod(frame1, 13, Lit49, 16388);
        lookup$Mnhandler = new ModuleMethod(frame1, 14, Lit50, 8194);
        ModuleMethod modulemethod = new ModuleMethod(frame1, 15, null, 0);
        modulemethod.setProperty("source-location", "/tmp/runtime8331147121019294373.scm:542");
        lambda$Fn1 = modulemethod;
        $define = new ModuleMethod(frame1, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(frame1, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(frame1, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(frame1, 19, null, 0);
        lambda$Fn5 = new ModuleMethod(frame1, 20, null, 0);
        lambda$Fn6 = new ModuleMethod(frame1, 21, null, 0);
        Ball1$Flung = new ModuleMethod(frame1, 22, Lit29, 24582);
        Ball1$EdgeReached = new ModuleMethod(frame1, 23, Lit33, 4097);
        Ball1$Touched = new ModuleMethod(frame1, 24, Lit37, 8194);
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object aobj[])
    {
        Object obj = LList.makeList(aobj, 0);
        gnu.kawa.functions.Apply apply = Scheme.apply;
        ModuleMethod modulemethod = strings.string$Mnappend;
        aobj = LList.Empty;
        do
        {
            if (obj == LList.Empty)
            {
                aobj = ((Object []) (apply.apply2(modulemethod, LList.reverseInPlace(((Object) (aobj))))));
                Object obj1;
                Symbol symbol;
                try
                {
                    obj = (CharSequence)aobj;
                }
                catch (ClassCastException classcastexception)
                {
                    throw new WrongType(classcastexception, "string->symbol", 1, ((Object) (aobj)));
                }
                return misc.string$To$Symbol(((CharSequence) (obj)));
            }
            try
            {
                obj1 = (Pair)obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                throw new WrongType(((ClassCastException) (aobj)), "arg0", -2, obj);
            }
            obj = ((Pair) (obj1)).getCdr();
            obj1 = ((Pair) (obj1)).getCar();
            try
            {
                symbol = (Symbol)obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[])
            {
                throw new WrongType(((ClassCastException) (aobj)), "symbol->string", 1, obj1);
            }
            aobj = Pair.make(misc.symbol$To$String(symbol), ((Object) (aobj)));
        } while (true);
    }

    static Object lambda2()
    {
        return null;
    }

    static Object lambda3()
    {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "ball", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Screen1", Lit4);
    }

    static Object lambda4()
    {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit13, Lit12, Lit10);
    }

    static Object lambda5()
    {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit13, Lit12, Lit10);
    }

    static Object lambda6()
    {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit17, Lit18, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit19, Lit20, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit21, Lit22, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit23, Lit24, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit25, Lit26, Lit10);
    }

    static Object lambda7()
    {
        runtime.setAndCoerceProperty$Ex(Lit16, Lit17, Lit18, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit19, Lit20, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit21, Lit22, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit16, Lit23, Lit24, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit25, Lit26, Lit10);
    }

    public void $define()
    {
        Object obj;
        Object obj1;
        Language.setDefaults(Scheme.getInstance());
        try
        {
            run();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            androidLogForm(((Exception) (obj)).getMessage());
            processException(obj);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        obj = events$Mnto$Mnregister;
_L12:
        if (obj != LList.Empty) goto _L2; else goto _L1
_L1:
        addToGlobalVars(Lit2, lambda$Fn1);
        obj = lists.reverse(global$Mnvars$Mnto$Mncreate);
_L13:
        if (obj != LList.Empty) goto _L4; else goto _L3
_L3:
        obj = lists.reverse(form$Mndo$Mnafter$Mncreation);
_L14:
        if (obj != LList.Empty) goto _L6; else goto _L5
_L5:
        obj = lists.reverse(components$Mnto$Mncreate);
        obj1 = obj;
_L15:
        if (obj1 != LList.Empty) goto _L8; else goto _L7
_L7:
        obj1 = obj;
_L16:
        if (obj1 != LList.Empty) goto _L10; else goto _L9
_L9:
        obj1 = LList.Empty;
        if (obj == obj1)
        {
            return;
        }
          goto _L11
_L2:
        ClassCastException classcastexception;
        Object obj2;
        Object obj3;
        Object obj4;
        Symbol symbol;
        try
        {
            obj2 = (Pair)obj;
        }
        catch (ClassCastException classcastexception1)
        {
            throw new WrongType(classcastexception1, "arg0", -2, obj);
        }
        obj1 = ((Pair) (obj2)).getCar();
        obj = lists.car.apply1(obj1);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        obj1 = lists.cdr.apply1(obj1);
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj1.toString();
        }
        EventDispatcher.registerEventForDelegation(this, ((String) (obj)), ((String) (obj1)));
        obj = ((Pair) (obj2)).getCdr();
          goto _L12
_L4:
        try
        {
            obj1 = (Pair)obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw new WrongType(((ClassCastException) (obj1)), "arg0", -2, obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                processException(obj);
            }
            return;
        }
        obj2 = ((Pair) (obj1)).getCar();
        obj = lists.car.apply1(obj2);
        obj2 = lists.cadr.apply1(obj2);
        obj3 = (Symbol)obj;
        addToGlobalVarEnvironment(((Symbol) (obj3)), Scheme.applyToArgs.apply1(obj2));
        obj = ((Pair) (obj1)).getCdr();
          goto _L13
        obj1;
        throw new WrongType(((ClassCastException) (obj1)), "add-to-global-var-environment", 0, obj);
_L6:
        obj1 = (Pair)obj;
        misc.force(((Pair) (obj1)).getCar());
        obj = ((Pair) (obj1)).getCdr();
          goto _L14
        obj1;
        throw new WrongType(((ClassCastException) (obj1)), "arg0", -2, obj);
_L8:
        obj2 = (Pair)obj1;
        obj4 = ((Pair) (obj2)).getCar();
        obj1 = lists.caddr.apply1(obj4);
        lists.cadddr.apply1(obj4);
        obj3 = lists.cadr.apply1(obj4);
        obj4 = lists.car.apply1(obj4);
        symbol = (Symbol)obj4;
        obj4 = lookupInFormEnvironment(symbol);
        obj3 = Invoke.make.apply2(obj3, obj4);
        SlotSet.set$Mnfield$Ex.apply3(this, obj1, obj3);
        obj4 = (Symbol)obj1;
        addToFormEnvironment(((Symbol) (obj4)), obj3);
        obj1 = ((Pair) (obj2)).getCdr();
          goto _L15
        obj;
        throw new WrongType(((ClassCastException) (obj)), "arg0", -2, obj1);
        obj;
        throw new WrongType(((ClassCastException) (obj)), "lookup-in-form-environment", 0, obj4);
        obj;
        throw new WrongType(((ClassCastException) (obj)), "add-to-form-environment", 0, obj1);
_L10:
        obj2 = (Pair)obj1;
        obj1 = ((Pair) (obj2)).getCar();
        lists.caddr.apply1(obj1);
        obj1 = lists.cadddr.apply1(obj1);
        if (obj1 != Boolean.FALSE)
        {
            Scheme.applyToArgs.apply1(obj1);
        }
        obj1 = ((Pair) (obj2)).getCdr();
          goto _L16
        obj;
        throw new WrongType(((ClassCastException) (obj)), "arg0", -2, obj1);
_L11:
        obj1 = (Pair)obj;
        obj = ((Pair) (obj1)).getCar();
        obj2 = lists.caddr.apply1(obj);
        lists.cadddr.apply1(obj);
        callInitialize(SlotGet.field.apply2(this, obj2));
        obj = ((Pair) (obj1)).getCdr();
          goto _L9
        classcastexception;
        throw new WrongType(classcastexception, "arg0", -2, obj);
          goto _L12
    }

    public Object Ball1$EdgeReached(Object obj)
    {
        obj = runtime.sanitizeComponentData(obj);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit16, Lit31, LList.list1(obj), Lit32);
    }

    public Object Ball1$Flung(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        runtime.sanitizeComponentData(obj);
        runtime.sanitizeComponentData(obj1);
        obj = runtime.sanitizeComponentData(obj2);
        obj1 = runtime.sanitizeComponentData(obj3);
        runtime.sanitizeComponentData(obj4);
        runtime.sanitizeComponentData(obj5);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit16, Lit28, obj1, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit21, obj, Lit10);
    }

    public Object Ball1$Touched(Object obj, Object obj1)
    {
        obj = runtime.sanitizeComponentData(obj);
        obj1 = runtime.sanitizeComponentData(obj1);
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit16, Lit35, LList.list2(obj, obj1), Lit36);
    }

    public void addToComponents(Object obj, Object obj1, Object obj2, Object obj3)
    {
        components$Mnto$Mncreate = lists.cons(LList.list4(obj, obj1, obj2, obj3), components$Mnto$Mncreate);
    }

    public void addToEvents(Object obj, Object obj1)
    {
        events$Mnto$Mnregister = lists.cons(lists.cons(obj, obj1), events$Mnto$Mnregister);
    }

    public void addToFormDoAfterCreation(Object obj)
    {
        form$Mndo$Mnafter$Mncreation = lists.cons(obj, form$Mndo$Mnafter$Mncreation);
    }

    public void addToFormEnvironment(Symbol symbol, Object obj)
    {
        androidLogForm(Format.formatToString(0, new Object[] {
            "Adding ~A to env ~A with value ~A", symbol, form$Mnenvironment, obj
        }));
        form$Mnenvironment.put(symbol, obj);
    }

    public void addToGlobalVarEnvironment(Symbol symbol, Object obj)
    {
        androidLogForm(Format.formatToString(0, new Object[] {
            "Adding ~A to env ~A with value ~A", symbol, global$Mnvar$Mnenvironment, obj
        }));
        global$Mnvar$Mnenvironment.put(symbol, obj);
    }

    public void addToGlobalVars(Object obj, Object obj1)
    {
        global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(obj, obj1), global$Mnvars$Mnto$Mncreate);
    }

    public void androidLogForm(Object obj)
    {
    }

    public boolean dispatchEvent(Component component, String s, String s1, Object aobj[])
    {
        boolean flag = false;
        SimpleSymbol simplesymbol = misc.string$To$Symbol(s);
        if (isBoundInFormEnvironment(simplesymbol))
        {
            if (lookupInFormEnvironment(simplesymbol) == component)
            {
                component = ((Component) (lookupHandler(s, s1)));
                try
                {
                    Scheme.apply.apply2(component, LList.makeList(aobj, 0));
                }
                // Misplaced declaration of an exception variable
                catch (Component component)
                {
                    androidLogForm(component.getMessage());
                    component.printStackTrace();
                    processException(component);
                    return false;
                }
                flag = true;
            }
            return flag;
        } else
        {
            EventDispatcher.unregisterEventForDelegation(this, s, s1);
            return false;
        }
    }

    public boolean isBoundInFormEnvironment(Symbol symbol)
    {
        return form$Mnenvironment.isBound(symbol);
    }

    public Object lookupHandler(Object obj, Object obj1)
    {
        Object obj2 = null;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        if (obj1 == null)
        {
            obj1 = obj2;
        } else
        {
            obj1 = obj1.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(((String) (obj)), ((String) (obj1)))));
    }

    public Object lookupInFormEnvironment(Symbol symbol)
    {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public Object lookupInFormEnvironment(Symbol symbol, Object obj)
    {
        int i;
        if (form$Mnenvironment == null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i = i + 1 & 1;
        if (i == 0 ? i != 0 : form$Mnenvironment.isBound(symbol))
        {
            obj = form$Mnenvironment.get(symbol);
        }
        return obj;
    }

    public void processException(Object obj)
    {
        Object obj1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(obj, Lit1));
        if (obj1 == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj1.toString();
        }
        if (obj instanceof YailRuntimeError)
        {
            obj = ((YailRuntimeError)obj).getErrorType();
        } else
        {
            obj = "Runtime Error";
        }
        RuntimeErrorAlert.alert(this, ((String) (obj1)), ((String) (obj)), "End Application");
    }

    public void run()
    {
        CallContext callcontext;
        gnu.lists.Consumer consumer;
        callcontext = CallContext.getInstance();
        consumer = callcontext.consumer;
        callcontext.consumer = VoidConsumer.instance;
        run(callcontext);
        Throwable throwable = null;
_L2:
        ModuleBody.runCleanup(callcontext, throwable, consumer);
        return;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void run(CallContext callcontext)
    {
        gnu.lists.Consumer consumer = callcontext.consumer;
        callcontext = ((CallContext) (require.find("com.google.youngandroid.runtime")));
        Runnable runnable;
        try
        {
            runnable = (Runnable)callcontext;
        }
        catch (ClassCastException classcastexception)
        {
            throw new WrongType(classcastexception, "java.lang.Runnable.run()", 1, callcontext);
        }
        runnable.run();
        $Stdebug$Mnform$St = Boolean.FALSE;
        form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
        callcontext = strings.stringAppend(new Object[] {
            misc.symbol$To$String(Lit0), "-global-vars"
        });
        if (callcontext == null)
        {
            callcontext = null;
        } else
        {
            callcontext = callcontext.toString();
        }
        global$Mnvar$Mnenvironment = Environment.make(callcontext);
        Screen1 = null;
        form$Mnname$Mnsymbol = Lit0;
        events$Mnto$Mnregister = LList.Empty;
        components$Mnto$Mncreate = LList.Empty;
        global$Mnvars$Mnto$Mncreate = LList.Empty;
        form$Mndo$Mnafter$Mncreation = LList.Empty;
        callcontext = ((CallContext) (require.find("com.google.youngandroid.runtime")));
        try
        {
            runnable = (Runnable)callcontext;
        }
        catch (ClassCastException classcastexception1)
        {
            throw new WrongType(classcastexception1, "java.lang.Runnable.run()", 1, callcontext);
        }
        runnable.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "ball", Lit4);
            Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Screen1", Lit4), consumer);
        } else
        {
            addToFormDoAfterCreation(new Promise(lambda$Fn2));
        }
        Canvas1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit6, Lit7, lambda$Fn3), consumer);
        } else
        {
            addToComponents(Lit0, Lit14, Lit7, lambda$Fn4);
        }
        Ball1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit15, Lit16, lambda$Fn5), consumer);
        } else
        {
            addToComponents(Lit7, Lit27, Lit16, lambda$Fn6);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            runtime.addToCurrentFormEnvironment(Lit29, Ball1$Flung);
        } else
        {
            addToFormEnvironment(Lit29, Ball1$Flung);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Ball1", "Flung");
        } else
        {
            addToEvents(Lit16, Lit30);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            runtime.addToCurrentFormEnvironment(Lit33, Ball1$EdgeReached);
        } else
        {
            addToFormEnvironment(Lit33, Ball1$EdgeReached);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Ball1", "EdgeReached");
        } else
        {
            addToEvents(Lit16, Lit34);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            runtime.addToCurrentFormEnvironment(Lit37, Ball1$Touched);
        } else
        {
            addToFormEnvironment(Lit37, Ball1$Touched);
        }
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE)
        {
            EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Ball1", "Touched");
        } else
        {
            addToEvents(Lit16, Lit38);
        }
        runtime.initRuntime();
    }

    public void sendError(Object obj)
    {
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = obj.toString();
        }
        RetValManager.sendError(((String) (obj)));
    }

    static 
    {
        SimpleSymbol simplesymbol = (SimpleSymbol)(new SimpleSymbol("number")).readResolve();
        Lit10 = simplesymbol;
        Lit36 = PairWithPosition.make(simplesymbol, PairWithPosition.make(Lit10, LList.Empty, "/tmp/1452328462353_0.17525111950447447-0/youngandroidproject/../src/appinventor/ai_hemanth_savasere/ball/Screen1.yail", 0x2d07a), "/tmp/1452328462353_0.17525111950447447-0/youngandroidproject/../src/appinventor/ai_hemanth_savasere/ball/Screen1.yail", 0x2d072);
        Lit32 = PairWithPosition.make(Lit10, LList.Empty, "/tmp/1452328462353_0.17525111950447447-0/youngandroidproject/../src/appinventor/ai_hemanth_savasere/ball/Screen1.yail", 0x2b057);
        int ai[] = new int[2];
        ai[0] = 0xff00ff00;
        Lit9 = IntNum.make(ai);
    }

    private class frame extends ModuleBody
    {

        Screen1 $main;

        public Object apply0(ModuleMethod modulemethod)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.apply0(modulemethod);

            case 15: // '\017'
                return Screen1.lambda2();

            case 16: // '\020'
                $main.$define();
                return Values.empty;

            case 17: // '\021'
                return Screen1.lambda3();

            case 18: // '\022'
                return Screen1.lambda4();

            case 19: // '\023'
                return Screen1.lambda5();

            case 20: // '\024'
                return Screen1.lambda6();

            case 21: // '\025'
                return Screen1.lambda7();
            }
        }

        public Object apply1(ModuleMethod modulemethod, Object obj)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.apply1(modulemethod, obj);

            case 1: // '\001'
                $main.androidLogForm(obj);
                return Values.empty;

            case 3: // '\003'
                modulemethod = $main;
                Symbol symbol;
                try
                {
                    symbol = (Symbol)obj;
                }
                // Misplaced declaration of an exception variable
                catch (ModuleMethod modulemethod)
                {
                    throw new WrongType(modulemethod, "lookup-in-form-environment", 1, obj);
                }
                return modulemethod.lookupInFormEnvironment(symbol);

            case 5: // '\005'
                modulemethod = $main;
                try
                {
                    symbol = (Symbol)obj;
                }
                // Misplaced declaration of an exception variable
                catch (ModuleMethod modulemethod)
                {
                    throw new WrongType(modulemethod, "is-bound-in-form-environment", 1, obj);
                }
                if (modulemethod.isBoundInFormEnvironment(symbol))
                {
                    return Boolean.TRUE;
                } else
                {
                    return Boolean.FALSE;
                }

            case 10: // '\n'
                $main.addToFormDoAfterCreation(obj);
                return Values.empty;

            case 11: // '\013'
                $main.sendError(obj);
                return Values.empty;

            case 12: // '\f'
                $main.processException(obj);
                return Values.empty;

            case 23: // '\027'
                return $main.Ball1$EdgeReached(obj);
            }
        }

        public Object apply2(ModuleMethod modulemethod, Object obj, Object obj1)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.apply2(modulemethod, obj, obj1);

            case 2: // '\002'
                modulemethod = $main;
                Symbol symbol;
                try
                {
                    symbol = (Symbol)obj;
                }
                // Misplaced declaration of an exception variable
                catch (ModuleMethod modulemethod)
                {
                    throw new WrongType(modulemethod, "add-to-form-environment", 1, obj);
                }
                modulemethod.addToFormEnvironment(symbol, obj1);
                return Values.empty;

            case 3: // '\003'
                modulemethod = $main;
                try
                {
                    symbol = (Symbol)obj;
                }
                // Misplaced declaration of an exception variable
                catch (ModuleMethod modulemethod)
                {
                    throw new WrongType(modulemethod, "lookup-in-form-environment", 1, obj);
                }
                return modulemethod.lookupInFormEnvironment(symbol, obj1);

            case 6: // '\006'
                modulemethod = $main;
                try
                {
                    symbol = (Symbol)obj;
                }
                // Misplaced declaration of an exception variable
                catch (ModuleMethod modulemethod)
                {
                    throw new WrongType(modulemethod, "add-to-global-var-environment", 1, obj);
                }
                modulemethod.addToGlobalVarEnvironment(symbol, obj1);
                return Values.empty;

            case 7: // '\007'
                $main.addToEvents(obj, obj1);
                return Values.empty;

            case 9: // '\t'
                $main.addToGlobalVars(obj, obj1);
                return Values.empty;

            case 14: // '\016'
                return $main.lookupHandler(obj, obj1);

            case 24: // '\030'
                return $main.Ball1$Touched(obj, obj1);
            }
        }

        public Object apply4(ModuleMethod modulemethod, Object obj, Object obj1, Object obj2, Object obj3)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.apply4(modulemethod, obj, obj1, obj2, obj3);

            case 8: // '\b'
                $main.addToComponents(obj, obj1, obj2, obj3);
                return Values.empty;

            case 13: // '\r'
                modulemethod = $main;
                break;
            }
            Component component;
            try
            {
                component = (Component)obj;
            }
            // Misplaced declaration of an exception variable
            catch (ModuleMethod modulemethod)
            {
                throw new WrongType(modulemethod, "dispatchEvent", 1, obj);
            }
            try
            {
                obj = (String)obj1;
            }
            // Misplaced declaration of an exception variable
            catch (ModuleMethod modulemethod)
            {
                throw new WrongType(modulemethod, "dispatchEvent", 2, obj1);
            }
            try
            {
                obj1 = (String)obj2;
            }
            // Misplaced declaration of an exception variable
            catch (ModuleMethod modulemethod)
            {
                throw new WrongType(modulemethod, "dispatchEvent", 3, obj2);
            }
            try
            {
                obj2 = ((Object) ((Object[])obj3));
            }
            // Misplaced declaration of an exception variable
            catch (ModuleMethod modulemethod)
            {
                throw new WrongType(modulemethod, "dispatchEvent", 4, obj3);
            }
            if (modulemethod.dispatchEvent(component, ((String) (obj)), ((String) (obj1)), ((Object []) (obj2))))
            {
                return Boolean.TRUE;
            } else
            {
                return Boolean.FALSE;
            }
        }

        public Object applyN(ModuleMethod modulemethod, Object aobj[])
        {
            if (modulemethod.selector == 22)
            {
                return $main.Ball1$Flung(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5]);
            } else
            {
                return super.applyN(modulemethod, aobj);
            }
        }

        public int match0(ModuleMethod modulemethod, CallContext callcontext)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.match0(modulemethod, callcontext);

            case 21: // '\025'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 20: // '\024'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 19: // '\023'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 18: // '\022'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 17: // '\021'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 16: // '\020'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;

            case 15: // '\017'
                callcontext.proc = modulemethod;
                callcontext.pc = 0;
                return 0;
            }
        }

        public int match1(ModuleMethod modulemethod, Object obj, CallContext callcontext)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.match1(modulemethod, obj, callcontext);

            case 23: // '\027'
                callcontext.value1 = obj;
                callcontext.proc = modulemethod;
                callcontext.pc = 1;
                return 0;

            case 12: // '\f'
                if (!(obj instanceof Screen1))
                {
                    return 0xfff40001;
                } else
                {
                    callcontext.value1 = obj;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 1;
                    return 0;
                }

            case 11: // '\013'
                callcontext.value1 = obj;
                callcontext.proc = modulemethod;
                callcontext.pc = 1;
                return 0;

            case 10: // '\n'
                callcontext.value1 = obj;
                callcontext.proc = modulemethod;
                callcontext.pc = 1;
                return 0;

            case 5: // '\005'
                if (!(obj instanceof Symbol))
                {
                    return 0xfff40001;
                } else
                {
                    callcontext.value1 = obj;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 1;
                    return 0;
                }

            case 3: // '\003'
                if (!(obj instanceof Symbol))
                {
                    return 0xfff40001;
                } else
                {
                    callcontext.value1 = obj;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 1;
                    return 0;
                }

            case 1: // '\001'
                callcontext.value1 = obj;
                callcontext.proc = modulemethod;
                callcontext.pc = 1;
                return 0;
            }
        }

        public int match2(ModuleMethod modulemethod, Object obj, Object obj1, CallContext callcontext)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.match2(modulemethod, obj, obj1, callcontext);

            case 24: // '\030'
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.proc = modulemethod;
                callcontext.pc = 2;
                return 0;

            case 14: // '\016'
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.proc = modulemethod;
                callcontext.pc = 2;
                return 0;

            case 9: // '\t'
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.proc = modulemethod;
                callcontext.pc = 2;
                return 0;

            case 7: // '\007'
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.proc = modulemethod;
                callcontext.pc = 2;
                return 0;

            case 6: // '\006'
                if (!(obj instanceof Symbol))
                {
                    return 0xfff40001;
                } else
                {
                    callcontext.value1 = obj;
                    callcontext.value2 = obj1;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 2;
                    return 0;
                }

            case 3: // '\003'
                if (!(obj instanceof Symbol))
                {
                    return 0xfff40001;
                } else
                {
                    callcontext.value1 = obj;
                    callcontext.value2 = obj1;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 2;
                    return 0;
                }

            case 2: // '\002'
                break;
            }
            if (!(obj instanceof Symbol))
            {
                return 0xfff40001;
            } else
            {
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.proc = modulemethod;
                callcontext.pc = 2;
                return 0;
            }
        }

        public int match4(ModuleMethod modulemethod, Object obj, Object obj1, Object obj2, Object obj3, CallContext callcontext)
        {
            switch (modulemethod.selector)
            {
            default:
                return super.match4(modulemethod, obj, obj1, obj2, obj3, callcontext);

            case 13: // '\r'
                if (!(obj instanceof Screen1))
                {
                    return 0xfff40001;
                }
                callcontext.value1 = obj;
                if (!(obj1 instanceof Component))
                {
                    return 0xfff40002;
                }
                callcontext.value2 = obj1;
                if (!(obj2 instanceof String))
                {
                    return 0xfff40003;
                }
                callcontext.value3 = obj2;
                if (!(obj3 instanceof String))
                {
                    return 0xfff40004;
                } else
                {
                    callcontext.value4 = obj3;
                    callcontext.proc = modulemethod;
                    callcontext.pc = 4;
                    return 0;
                }

            case 8: // '\b'
                callcontext.value1 = obj;
                callcontext.value2 = obj1;
                callcontext.value3 = obj2;
                callcontext.value4 = obj3;
                callcontext.proc = modulemethod;
                callcontext.pc = 4;
                return 0;
            }
        }

        public int matchN(ModuleMethod modulemethod, Object aobj[], CallContext callcontext)
        {
            if (modulemethod.selector == 22)
            {
                callcontext.values = aobj;
                callcontext.proc = modulemethod;
                callcontext.pc = 5;
                return 0;
            } else
            {
                return super.matchN(modulemethod, aobj, callcontext);
            }
        }

        public frame()
        {
        }
    }

}
