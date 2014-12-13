// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ElixirNoParenthesesQualifier extends PsiElement {

  @NotNull
  List<ElixirMatchedExpression> getMatchedExpressionList();

  @Nullable
  ElixirNoParenthesesQualifierAtOperation getNoParenthesesQualifierAtOperation();

  @Nullable
  ElixirNoParenthesesQualifierNumberAtOperation getNoParenthesesQualifierNumberAtOperation();

  @Nullable
  ElixirNoParenthesesQualifierNumberCaptureOperation getNoParenthesesQualifierNumberCaptureOperation();

  @Nullable
  ElixirNoParenthesesQualifierNumberUnaryOperation getNoParenthesesQualifierNumberUnaryOperation();

}