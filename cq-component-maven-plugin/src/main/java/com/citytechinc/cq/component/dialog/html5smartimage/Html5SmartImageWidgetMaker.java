package com.citytechinc.cq.component.dialog.html5smartimage;

import org.codehaus.plexus.util.StringUtils;

import com.citytechinc.cq.component.annotations.widgets.Html5SmartImage;
import com.citytechinc.cq.component.dialog.DialogElement;
import com.citytechinc.cq.component.dialog.maker.AbstractWidgetMaker;
import com.citytechinc.cq.component.dialog.maker.WidgetMakerParameters;

public class Html5SmartImageWidgetMaker extends AbstractWidgetMaker {

	public Html5SmartImageWidgetMaker(WidgetMakerParameters parameters) {
		super(parameters);
	}

	public DialogElement make() throws ClassNotFoundException {

		Html5SmartImage smartImageAnnotation = getAnnotation(Html5SmartImage.class);

		Html5SmartImageWidgetParameters parameters = new Html5SmartImageWidgetParameters();

		parameters.setName(getNameForField(smartImageAnnotation));
		parameters.setFieldName(getFieldNameForField());
		parameters.setFieldLabel(getFieldLabelForField());
		parameters.setFieldDescription(getFieldDescriptionForField());
		parameters.setAllowBlank(!getIsRequiredForField());
		parameters.setDefaultValue(getDefaultValueForField());
		parameters.setHideLabel(getHideLabelForField());
		parameters.setListeners(getListeners());

		parameters.setDisableFlush(getDisableFlushForField(smartImageAnnotation));
		parameters.setDisableInfo(getDisableInfoForField(smartImageAnnotation));
		parameters.setDisableZoom(getDisableZoomForField(smartImageAnnotation));
		parameters.setCropParameter(getCropParameterForField(smartImageAnnotation));
		parameters.setFileNameParameter(getFileNameParameterForField(smartImageAnnotation));
		parameters.setFileReferenceParameter(getFileReferenceParameterForField(smartImageAnnotation));
		parameters.setMapParameter(getMapParameterForField(smartImageAnnotation));
		parameters.setRotateParameter(getRotateParameterForField(smartImageAnnotation));
		parameters.setUploadUrl(getUploadUrlForField(smartImageAnnotation));
		parameters.setDdGroups(getDdGroupsForField(smartImageAnnotation));
		parameters.setAllowUpload(getAllowUploadForField(smartImageAnnotation));
		parameters.setHeight(getHeightForField(smartImageAnnotation));
		parameters.setTab(smartImageAnnotation.tab());

		return new Html5SmartImageWidget(parameters);

	}

	protected String getNameForField(Html5SmartImage smartImageAnnotation) {
		String name = smartImageAnnotation.name();

		if (StringUtils.isNotEmpty(name)) {
			return name;
		}

		return null;
	}

	protected String getCropParameterForField(Html5SmartImage smartImageAnnotation) {
		String cropParameter = smartImageAnnotation.cropParameter();

		if (StringUtils.isNotEmpty(cropParameter)) {
			return cropParameter;
		}

		return null;
	}

	protected String getFileNameParameterForField(Html5SmartImage smartImageAnnotation) {
		String fileNameParameter = smartImageAnnotation.fileNameParameter();

		if (StringUtils.isNotEmpty(fileNameParameter)) {
			return fileNameParameter;
		}

		return null;
	}

	protected String getFileReferenceParameterForField(Html5SmartImage smartImageAnnotation) {
		String fileReferenceParameter = smartImageAnnotation.fileReferenceParameter();

		if (StringUtils.isNotEmpty(fileReferenceParameter)) {
			return fileReferenceParameter;
		}

		return null;
	}

	protected String getMapParameterForField(Html5SmartImage smartImageAnnotation) {
		String mapParameter = smartImageAnnotation.mapParameter();

		if (StringUtils.isNotEmpty(mapParameter)) {
			return mapParameter;
		}

		return null;
	}

	protected String getRotateParameterForField(Html5SmartImage smartImageAnnotation) {
		String rotateParameter = smartImageAnnotation.rotateParameter();
		if (StringUtils.isNotEmpty(rotateParameter)) {
			return rotateParameter;
		}

		return null;
	}

	protected String getUploadUrlForField(Html5SmartImage smartImageAnnotation) {
		String uploadUrl = smartImageAnnotation.uploadUrl();
		if (StringUtils.isNotEmpty(uploadUrl)) {
			return uploadUrl;
		}

		return null;
	}

	protected String getDdGroupsForField(Html5SmartImage smartImageAnnotation) {

		String ddGroups = smartImageAnnotation.ddGroups();
		if (StringUtils.isNotEmpty(ddGroups)) {
			return ddGroups;
		}

		return null;

	}

	protected Integer getHeightForField(Html5SmartImage smartImageAnnotation) {
		Integer height = smartImageAnnotation.height();

		if (height != 0) {
			return height;
		}

		return null;
	}

	protected boolean getDisableFlushForField(Html5SmartImage smartImageAnnotation) {
		return smartImageAnnotation.disableFlush();
	}

	protected boolean getDisableInfoForField(Html5SmartImage smartImageAnnotation) {
		return smartImageAnnotation.disableInfo();
	}

	protected boolean getDisableZoomForField(Html5SmartImage smartImageAnnotation) {
		return smartImageAnnotation.disableZoom();
	}

	protected boolean getAllowUploadForField(Html5SmartImage smartImageAnnotation) {
		return smartImageAnnotation.allowUpload();
	}
}