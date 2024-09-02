package com.example.navegacionjpc.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

public val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

public val lightPinkScheme = lightColorScheme(
    primary = pink_primaryLight,
    onPrimary = pink_onPrimaryLight,
    primaryContainer = pink_primaryContainerLight,
    onPrimaryContainer = pink_onPrimaryContainerLight,
    secondary = pink_secondaryLight,
    onSecondary = pink_onSecondaryLight,
    secondaryContainer = pink_secondaryContainerLight,
    onSecondaryContainer = pink_onSecondaryContainerLight,
    tertiary = pink_tertiaryLight,
    onTertiary = pink_onTertiaryLight,
    tertiaryContainer = pink_tertiaryContainerLight,
    onTertiaryContainer = pink_onTertiaryContainerLight,
    error = pink_errorLight,
    onError = pink_onErrorLight,
    errorContainer = pink_errorContainerLight,
    onErrorContainer = pink_onErrorContainerLight,
    background = pink_backgroundLight,
    onBackground = pink_onBackgroundLight,
    surface = pink_surfaceLight,
    onSurface = pink_onSurfaceLight,
    surfaceVariant = pink_surfaceVariantLight,
    onSurfaceVariant = pink_onSurfaceVariantLight,
    outline = pink_outlineLight,
    outlineVariant = pink_outlineVariantLight,
    scrim = pink_scrimLight,
    inverseSurface = pink_inverseSurfaceLight,
    inverseOnSurface = pink_inverseOnSurfaceLight,
    inversePrimary = pink_inversePrimaryLight,
    surfaceDim = pink_surfaceDimLight,
    surfaceBright = pink_surfaceBrightLight,
    surfaceContainerLowest = pink_surfaceContainerLowestLight,
    surfaceContainerLow = pink_surfaceContainerLowLight,
    surfaceContainer = pink_surfaceContainerLight,
    surfaceContainerHigh = pink_surfaceContainerHighLight,
    surfaceContainerHighest = pink_surfaceContainerHighestLight,
)

public val darkPinkScheme = darkColorScheme(
    primary = pink_primaryDark,
    onPrimary = pink_onPrimaryDark,
    primaryContainer = pink_primaryContainerDark,
    onPrimaryContainer = pink_onPrimaryContainerDark,
    secondary = pink_secondaryDark,
    onSecondary = pink_onSecondaryDark,
    secondaryContainer = pink_secondaryContainerDark,
    onSecondaryContainer = pink_onSecondaryContainerDark,
    tertiary = pink_tertiaryDark,
    onTertiary = pink_onTertiaryDark,
    tertiaryContainer = pink_tertiaryContainerDark,
    onTertiaryContainer = pink_onTertiaryContainerDark,
    error = pink_errorDark,
    onError = pink_onErrorDark,
    errorContainer = pink_errorContainerDark,
    onErrorContainer = pink_onErrorContainerDark,
    background = pink_backgroundDark,
    onBackground = pink_onBackgroundDark,
    surface = pink_surfaceDark,
    onSurface = pink_onSurfaceDark,
    surfaceVariant = pink_surfaceVariantDark,
    onSurfaceVariant = pink_onSurfaceVariantDark,
    outline = pink_outlineDark,
    outlineVariant = pink_outlineVariantDark,
    scrim = pink_scrimDark,
    inverseSurface = pink_inverseSurfaceDark,
    inverseOnSurface = pink_inverseOnSurfaceDark,
    inversePrimary = pink_inversePrimaryDark,
    surfaceDim = pink_surfaceDimDark,
    surfaceBright = pink_surfaceBrightDark,
    surfaceContainerLowest = pink_surfaceContainerLowestDark,
    surfaceContainerLow = pink_surfaceContainerLowDark,
    surfaceContainer = pink_surfaceContainerDark,
    surfaceContainerHigh = pink_surfaceContainerHighDark,
    surfaceContainerHighest = pink_surfaceContainerHighestDark,
)

public val lightTurquesaScheme = lightColorScheme(
    primary = turquesa_primaryLight,
    onPrimary = turquesa_onPrimaryLight,
    primaryContainer = turquesa_primaryContainerLight,
    onPrimaryContainer = turquesa_onPrimaryContainerLight,
    secondary = turquesa_secondaryLight,
    onSecondary = turquesa_onSecondaryLight,
    secondaryContainer = turquesa_secondaryContainerLight,
    onSecondaryContainer = turquesa_onSecondaryContainerLight,
    tertiary = turquesa_tertiaryLight,
    onTertiary = turquesa_onTertiaryLight,
    tertiaryContainer = turquesa_tertiaryContainerLight,
    onTertiaryContainer = turquesa_onTertiaryContainerLight,
    error = turquesa_errorLight,
    onError = turquesa_onErrorLight,
    errorContainer = turquesa_errorContainerLight,
    onErrorContainer = turquesa_onErrorContainerLight,
    background = turquesa_backgroundLight,
    onBackground = turquesa_onBackgroundLight,
    surface = turquesa_surfaceLight,
    onSurface = turquesa_onSurfaceLight,
    surfaceVariant = turquesa_surfaceVariantLight,
    onSurfaceVariant = turquesa_onSurfaceVariantLight,
    outline = turquesa_outlineLight,
    outlineVariant = turquesa_outlineVariantLight,
    scrim = turquesa_scrimLight,
    inverseSurface = turquesa_inverseSurfaceLight,
    inverseOnSurface = turquesa_inverseOnSurfaceLight,
    inversePrimary = turquesa_inversePrimaryLight,
    surfaceDim = turquesa_surfaceDimLight,
    surfaceBright = turquesa_surfaceBrightLight,
    surfaceContainerLowest = turquesa_surfaceContainerLowestLight,
    surfaceContainerLow = turquesa_surfaceContainerLowLight,
    surfaceContainer = turquesa_surfaceContainerLight,
    surfaceContainerHigh = turquesa_surfaceContainerHighLight,
    surfaceContainerHighest = turquesa_surfaceContainerHighestLight,
)

public val darkTurquesaScheme = darkColorScheme(
    primary = turquesa_primaryDark,
    onPrimary = turquesa_onPrimaryDark,
    primaryContainer = turquesa_primaryContainerDark,
    onPrimaryContainer = turquesa_onPrimaryContainerDark,
    secondary = turquesa_secondaryDark,
    onSecondary = turquesa_onSecondaryDark,
    secondaryContainer = turquesa_secondaryContainerDark,
    onSecondaryContainer = turquesa_onSecondaryContainerDark,
    tertiary = turquesa_tertiaryDark,
    onTertiary = turquesa_onTertiaryDark,
    tertiaryContainer = turquesa_tertiaryContainerDark,
    onTertiaryContainer = turquesa_onTertiaryContainerDark,
    error = turquesa_errorDark,
    onError = turquesa_onErrorDark,
    errorContainer = turquesa_errorContainerDark,
    onErrorContainer = turquesa_onErrorContainerDark,
    background = turquesa_backgroundDark,
    onBackground = turquesa_onBackgroundDark,
    surface = turquesa_surfaceDark,
    onSurface = turquesa_onSurfaceDark,
    surfaceVariant = turquesa_surfaceVariantDark,
    onSurfaceVariant = turquesa_onSurfaceVariantDark,
    outline = turquesa_outlineDark,
    outlineVariant = turquesa_outlineVariantDark,
    scrim = turquesa_scrimDark,
    inverseSurface = turquesa_inverseSurfaceDark,
    inverseOnSurface = turquesa_inverseOnSurfaceDark,
    inversePrimary = turquesa_inversePrimaryDark,
    surfaceDim = turquesa_surfaceDimDark,
    surfaceBright = turquesa_surfaceBrightDark,
    surfaceContainerLowest = turquesa_surfaceContainerLowestDark,
    surfaceContainerLow = turquesa_surfaceContainerLowDark,
    surfaceContainer = turquesa_surfaceContainerDark,
    surfaceContainerHigh = turquesa_surfaceContainerHighDark,
    surfaceContainerHighest = turquesa_surfaceContainerHighestDark,
)


enum class ThemeType{RED, GREEN}

@Composable
fun NavegacionJPC2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    /*val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }*/

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}