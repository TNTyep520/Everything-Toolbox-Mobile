package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: StringBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\r\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a6\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001f\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087\b\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000e\"\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000f\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u0007H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0012H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0013H\u0087\b\u001a\u001d\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0014H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0087\b\u001a\u001f\u0010\u0011\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"buildString", HttpUrl.FRAGMENT_ENCODE_SET, "capacity", HttpUrl.FRAGMENT_ENCODE_SET, "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "append", "obj", HttpUrl.FRAGMENT_ENCODE_SET, "value", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendLine", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/text/StringsKt")
class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @ReplaceWith(expression = "append(value = obj)", imports = {}))
    private static final StringBuilder append(StringBuilder $this$append, Object obj) {
        $this$append.append(obj);
        Intrinsics.checkNotNullExpressionValue($this$append, "this.append(obj)");
        return $this$append;
    }

    private static final String buildString(Function1<? super StringBuilder, Unit> function1) {
        StringBuilder sb = new StringBuilder();
        function1.invoke(sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final String buildString(int capacity, Function1<? super StringBuilder, Unit> function1) {
        StringBuilder sb = new StringBuilder(capacity);
        function1.invoke(sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final StringBuilder append(StringBuilder append, String... value) {
        Intrinsics.checkNotNullParameter(append, "$this$append");
        Intrinsics.checkNotNullParameter(value, "value");
        for (String item : value) {
            append.append(item);
        }
        return append;
    }

    public static final StringBuilder append(StringBuilder append, Object... value) {
        Intrinsics.checkNotNullParameter(append, "$this$append");
        Intrinsics.checkNotNullParameter(value, "value");
        for (Object item : value) {
            append.append(item);
        }
        return append;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine) {
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, CharSequence value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, String value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, Object value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, char[] value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, char value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }

    private static final StringBuilder appendLine(StringBuilder $this$appendLine, boolean value) {
        $this$appendLine.append(value);
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append(value)");
        $this$appendLine.append('\n');
        Intrinsics.checkNotNullExpressionValue($this$appendLine, "append('\\n')");
        return $this$appendLine;
    }
}
