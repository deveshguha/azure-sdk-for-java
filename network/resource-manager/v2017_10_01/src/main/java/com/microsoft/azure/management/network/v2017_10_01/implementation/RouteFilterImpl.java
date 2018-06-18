/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2017_10_01.RouteFilter;
import rx.Observable;
import com.microsoft.azure.management.network.v2017_10_01.PatchRouteFilter;
import java.util.List;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2017_10_01.ExpressRouteCircuitPeering;
import com.microsoft.azure.management.network.v2017_10_01.RouteFilterRule;
import rx.functions.Func1;

class RouteFilterImpl extends GroupableResourceCoreImpl<RouteFilter, RouteFilterInner, RouteFilterImpl, NetworkManager> implements RouteFilter, RouteFilter.Definition, RouteFilter.Update {
    private PatchRouteFilter updateParameter;
    RouteFilterImpl(String name, RouteFilterInner inner, NetworkManager manager) {
        super(name, inner, manager);
        this.updateParameter = new PatchRouteFilter();
    }

    @Override
    public Observable<RouteFilter> createResourceAsync() {
        RouteFiltersInner client = this.manager().inner().routeFilters();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<RouteFilterInner, RouteFilterInner>() {
               @Override
               public RouteFilterInner call(RouteFilterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RouteFilter> updateResourceAsync() {
        RouteFiltersInner client = this.manager().inner().routeFilters();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<RouteFilterInner, RouteFilterInner>() {
               @Override
               public RouteFilterInner call(RouteFilterInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RouteFilterInner> getInnerAsync() {
        RouteFiltersInner client = this.manager().inner().routeFilters();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new PatchRouteFilter();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<ExpressRouteCircuitPeering> peerings() {
        List<ExpressRouteCircuitPeering> lst = new ArrayList<ExpressRouteCircuitPeering>();
        if (this.inner().peerings() != null) {
            for (ExpressRouteCircuitPeeringInner inner : this.inner().peerings()) {
                lst.add( new ExpressRouteCircuitPeeringImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<RouteFilterRule> rules() {
        List<RouteFilterRule> lst = new ArrayList<RouteFilterRule>();
        if (this.inner().rules() != null) {
            for (RouteFilterRuleInner inner : this.inner().rules()) {
                lst.add( new RouteFilterRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public RouteFilterImpl withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        if (isInCreateMode()) {
            this.inner().withPeerings(peerings);
        } else {
            this.updateParameter.withPeerings(peerings);
        }
        return this;
    }

    @Override
    public RouteFilterImpl withRules(List<RouteFilterRuleInner> rules) {
        if (isInCreateMode()) {
            this.inner().withRules(rules);
        } else {
            this.updateParameter.withRules(rules);
        }
        return this;
    }

}
