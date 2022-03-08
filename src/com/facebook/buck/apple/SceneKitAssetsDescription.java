/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.buck.apple;

import com.facebook.buck.core.model.BuildTarget;
import com.facebook.buck.core.model.Flavor;
import com.facebook.buck.core.model.Flavored;
import com.facebook.buck.core.model.TargetConfiguration;
import com.facebook.buck.core.rules.BuildRule;
import com.facebook.buck.core.rules.BuildRuleCreationContextWithTargetGraph;
import com.facebook.buck.core.rules.BuildRuleParams;
import com.facebook.buck.core.rules.DescriptionWithTargetGraph;
import com.facebook.buck.core.rules.impl.NoopBuildRuleWithDeclaredAndExtraDeps;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Files;

/**
 * Description for a scenekit_assets rule, which identifies a assets directory for use with Apple's
 * SceneKit.
 */
public class SceneKitAssetsDescription
    implements DescriptionWithTargetGraph<AppleWrapperResourceArg>, Flavored {

  private static final String SCENEKIT_ASSETS_EXTENSION = "scnassets";

  @Override
  public Class<AppleWrapperResourceArg> getConstructorArgType() {
    return AppleWrapperResourceArg.class;
  }

  @Override
  public BuildRule createBuildRule(
      BuildRuleCreationContextWithTargetGraph context,
      BuildTarget buildTarget,
      BuildRuleParams params,
      AppleWrapperResourceArg args) {
    String extension = Files.getFileExtension(args.getPath().getFileName().toString());
    Preconditions.checkArgument(SCENEKIT_ASSETS_EXTENSION.equals(extension));

    return new NoopBuildRuleWithDeclaredAndExtraDeps(
        buildTarget, context.getProjectFilesystem(), params);
  }

  @Override
  public boolean hasFlavors(
      ImmutableSet<Flavor> flavors, TargetConfiguration toolchainTargetConfiguration) {
    return true;
  }
}
